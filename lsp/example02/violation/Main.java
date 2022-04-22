package lsp.example02.violation;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println();

        Duck robberDuck = new RubberDuck();
        robberDuck.quack();
        robberDuck.fly();
    }
}
