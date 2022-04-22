package dip.satisfaction;

public class Main {
    public static void main(String[] args) {
        HiringService.hire(new Developer());
        HiringService.hire(new Designer());
        HiringService.hire(new Tester());
    }
}
