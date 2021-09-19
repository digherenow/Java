class DivideException extends RuntimeException {
    DivideException(){
        super();
    }
}

class CalculatorDemo {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void divide() {
        if (right == 0){
            throw new ArithmeticException("0으로 나눌수 없습니다.");
        }
        try {
            System.out.println("계산결과는 ");
            System.out.println(this.left / this.right);
            System.out.println(" 입니다.");
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException e");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException e");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //예외처리와 관계없이 실행
            System.out.println("end");
        }
    }
}

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorDemo c1 = new CalculatorDemo();
        c1.setOprands(10,0);
        c1.divide();
    }
}
