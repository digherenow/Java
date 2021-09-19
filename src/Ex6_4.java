class Cal {
    int add(int left, int right) {
        int sum = left + right;
        return sum;
    }
    int multi(int left, int right) {
        int multi = left * right;
        return multi;
    }
    int max(int a, int b) {
        int result;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }
}

public class Ex6_4 {
    public static void main(String[] args) {
        Cal c1 = new Cal();
        int result1 = c1.add(1,3);
        int result2 = c1.multi(1,3);
        int max = c1.max(2,3);
        System.out.println(result1);
        System.out.println(max);
    }
}
