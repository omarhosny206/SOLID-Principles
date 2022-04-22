package dip.violation;

public class HiringService {
    public static void hireDeveloper(Developer developer) {
        System.out.println(developer.getTitle() + " is hired");
    }

    public static void hireDesigner(Designer designer) {
        System.out.println(designer.getTitle() + " is hired");
    }

    public static void hireTester(Tester tester) {
        System.out.println(tester.getTitle() + " is hired");
    }
}
