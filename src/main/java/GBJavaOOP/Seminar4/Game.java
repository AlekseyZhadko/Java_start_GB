package GBJavaOOP.Seminar4;

public class Game {
    public void Start() {
        System.out.println((char) 27 + "[31mЗадача с волновым алгоритмом! " + (char) 27 + "[0m");
        WaveAlgorithm lab = new WaveAlgorithm();
        lab.createLabyrinth();
        System.out.println(lab);
        lab.startPoint();
        System.out.println(lab);
        lab.exitPoint();
        lab.Wave();
        System.out.println(lab);
    }
}
