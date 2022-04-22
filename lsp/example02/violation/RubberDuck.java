package lsp.example02.violation;

public class RubberDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("I quack like a Rubber duck");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("I can't fly");
    }
}
