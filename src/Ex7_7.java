public class Ex7_7 {
    public static void main(String[] args) {
        Car c = new Car();
        if (c instanceof FireCar) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive!!!@@@@@");
    }

    void stop() {
        System.out.println("stop!!!");
    }
}

class FireCar extends Car {
    void water() {
        System.out.println("water!!!");
    }
}
