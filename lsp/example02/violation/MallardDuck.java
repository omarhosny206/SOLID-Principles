package lsp.example02.violation;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("I quack like a Mallard duck");
    }

    @Override
    public void fly() {
        System.out.println("I fly like a Mallard duck");
    }
}
