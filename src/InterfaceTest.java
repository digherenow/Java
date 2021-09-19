class A {
    public void method(I i) {
        i.method();
    }
}

//class B {
//    public void method() {
//        System.out.println("B클래스의 매서드");
//    }
//}

interface I {
    public void method() ;
}

class B implements I {
    public void method() {
        System.out.println("B클래스의 매서드");
    }
}

class C implements I {
    public void method() {
        System.out.println("C클래스의 매서드");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.method(new C());
    }
}
