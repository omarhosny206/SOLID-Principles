package dip.violation;

public class Main {
    public static void main(String[] args) {
        HiringService.hireDeveloper(new Developer());
        HiringService.hireDesigner(new Designer());
        HiringService.hireTester(new Tester());
    }
}
