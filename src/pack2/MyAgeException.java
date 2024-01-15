package pack2;

public class MyAgeException extends Exception {
    private String message;

    public MyAgeException(String message) {
        this.message = message;
    }


    @Override
    public String getMessage() {
        return message;
    }
}
