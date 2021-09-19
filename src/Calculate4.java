class Calculator {
    int left, right;

    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }

    void sum(){
        System.out.println(this.left + this.right);

    }
    void avg(){
        System.out.println((this.left+this.right)/2);
    }
}

class SubCalculator extends Calculator {
    public SubCalculator(int left, int right){
        super(left, right);
    }
    void substract(){
        System.out.println(this.left - this.right);
    }
}

public class Calculate4 {
    public static void main(String[] args) {
        SubCalculator c1 = new SubCalculator(10,20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
