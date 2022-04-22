package lsp.example02.satisfaction;

public class Main {
    public static void main(String[] args) {
        Flyable mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println();

        Duck robberDuck = new RubberDuck();
        robberDuck.quack();
    }
}
