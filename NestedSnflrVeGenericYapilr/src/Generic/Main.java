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

        String[] x= {"cagri", "java", "102"};
        Integer[] y = {1, 2, 3, 4};
        Character[] z = {'j', 'a', 'v', 'a'};

        for(String i : x){
            System.out.println(i);
        }

        for(Integer i : y){
            System.out.println(i);
        }

        for(Character i: z){
            System.out.println(i);
        }

        Print.printArray(x);
        Print.printArray(y);
        Print.printArray(z);

        Student<Integer> stuA = new Student<>();
        stuA.insert(123);


        GenericBounded<Integer> n1 = new GenericBounded<>(42);
        n1.run();
        GenericBounded<Long> longNumber = new GenericBounded<>(null);
        n2.run();
    }
}
