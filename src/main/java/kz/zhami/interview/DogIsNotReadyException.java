package kz.zhami.interview;

public class DogIsNotReadyException extends RuntimeException{
    public DogIsNotReadyException(String message) {
        super(message);
    }
}
