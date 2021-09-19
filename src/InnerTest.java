class AA {
    int i = 100;
    BB b = new BB();

    class BB {
        void method() {
            System.out.println(i);
        }
    }
}

class CC {

}

public class InnerTest {
    public static void main(String[] args) {
        AA a = new AA();
        a.b.method();
    }
}
