package GBJavaExceptions.Seminar2.Task4;

public class Task4 {
    String str;

    public Task4(String str) {
        this.str = str;
    }

    public boolean CheckStrIsEmpty() {
        if (!str.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
