package GBJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeworkSeminar5Task4 {
    public static void main(String[] args) {
        String[] paths = new String[]{"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        System.out.println(findDuplicate(paths));
    }

    public static List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for(String path : paths) {
            String root = "";
            for(String file : path.split(" ")) {
                int index = file.indexOf('(');
                if(index == -1) {
                    root = file;
                    continue;
                }
                String fileName = file.substring(0, index);
                String content = file.substring(index+1, file.length() - 1);
                List<String> list = map.getOrDefault(content, new ArrayList<String>());
                list.add(root + "/" +fileName);
                map.put(content, list);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(String key : map.keySet()) {
            if(map.get(key).size() >= 2)
                res.add(map.get(key));
        }
        return res;
    }
}
