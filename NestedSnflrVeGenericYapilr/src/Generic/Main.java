package Generic;

public class Main {
    public static void main(String[] args) {
        //undefined
//        String s;
//        String s1 = null;
//        String s2 = "";
        String str = "cagri";
        Nullable n = new Nullable(str);
        n.run();

        String s = null;
        Nullable n2 = new Nullable(s);
        n2.run();

        Integer a = null;
        NullableIsInteger n3 = new NullableIsInteger(a);
        n3.run();

        //ilkel veri tipleriyle calismazlar
        //Wrapper olmalilar
        GnrcNullable<Integer> gnrc = new GnrcNullable<>(42);
        gnrc.run();

        Integer nmbr = 41;
        String text = "cagriyalniz";
        Double dbl = 3.14;

        MultiGnrc<Integer, String, Double> wow = new MultiGnrc<>(nmbr, text, dbl);
        wow.showInfo();
        String text2 = "yalnizcagri";
        wow.setObj2(text2);
        wow.showInfo();
    }
}