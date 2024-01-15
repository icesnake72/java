package pack2;

public class Calculator {

    public static int divide(int n1, int n2) {

        if (n2==0)
            throw new ArithmeticException("0으로 나눌 수 없습니다");

        int result;

        result = n1 / n2;
        return result;
    }
}
