public class NotFoundException extends RuntimeException{

    public NotFoundException(String message) {
        super("Игрок с именем " + message + " не зарегестрирован");
    }
}
