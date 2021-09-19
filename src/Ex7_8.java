import org.jetbrains.annotations.NotNull;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10);
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }
    public String toString() {return "Tv";};
}

class Computer extends Product {
    Computer() {
        super(200);
    }
    public String toString() {return "Computer";}
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    Product[] cart = new Product[10];

    int i = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p.toString() + "을/를 구입하셨습니다.");
        cart[i++] = p;
    }
}

public class Ex7_8 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("남은 돈은" + b.money + "입니다.");
        System.out.println("현재 포인트는" + b.bonusPoint + "입니다.");
    }
}
