package pack2;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void showInfo() {
        System.out.printf("%s의 나이는 %d살입니다\n", name, age);
    }

    public void setAge(int age) throws MyAgeException {
        if (age < 0)
            throw new MyAgeException("나이는 0보다 작을 수 없습니다.");

        this.age = age;
    }
}
