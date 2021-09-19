class MyPoin3 extends Object {
    int x;
    int y;

    MyPoin3(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "x:" + x + ", y:" + y;
    }
}

public class OverrideTest {
    public static void main(String[] args) {
        MyPoin3 p = new MyPoin3(3,5);
        System.out.println(p.toString());
    }
}
