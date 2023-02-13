package adapter;

public class Test {
    public static void test() {

        Fahrrad fahrrad = new Fahrrad(1, new TachoMeeter());
        fahrrad.fahre(30, 2);
        fahrrad.fahre(2, 1);
        System.out.println("Durchshnitt für Fahrrad" + 1 + ": " + fahrrad.getDurchschnitt());

        Fahrrad fahrrad1 = new Fahrrad(2, new TachoMeeter());
        fahrrad1.fahre(30, 2);
        fahrrad1.fahre(2, 1);
        System.out.println("Durchshnitt für Fahrrad" + 2 + ": " + fahrrad1.getDurchschnitt());

        System.out.println("Hello world!");
    }
}