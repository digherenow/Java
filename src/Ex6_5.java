class Data2 {
    int x;
}
public class Ex6_5 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;


        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);

    }
    static void change(Data2 e) {
        e.x = 1000;
    }

}