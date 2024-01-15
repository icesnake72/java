package pack2;

public class Program {
    public static void main(String[] args) {
        try {
            System.out.println(Calculator.divide(10, 0));
        } catch (ArithmeticException e) {
            // throw e;
            System.out.println(e.getMessage());
        }

        Person person = new Person(12, "john");
        person.showInfo();
        // person.setAge(-10);
        try {
            person.setAge(-10);
        } catch (MyAgeException e) {
            System.out.println(e.getMessage());
        }
        person.showInfo();
    }
}
