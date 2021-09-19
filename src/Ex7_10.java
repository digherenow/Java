abstract class Unit {
    int x,y;
    abstract void move(int x, int y);
    void stop() {}
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("marin"+x+y);
    }
}

class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("tank"+x+y);
    }
}

class Dropship extends Unit {
    void move(int x, int y) {
        System.out.println("dropship"+x+y);
    }
}

public class Ex7_10 {
    public static void main(String[] args) {
        Unit[] group = new Unit[3];
        group[0] = new Marine();
        group[1] = new Tank();
        group[2] = new Dropship();
    }
}
