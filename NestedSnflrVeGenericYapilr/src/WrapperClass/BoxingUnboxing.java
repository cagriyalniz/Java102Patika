package WrapperClass;

public class BoxingUnboxing {
    public static void main(String[] args) {
        int a = 10;
        //Autoboxing
        Integer b = a;

        //Boxing
        Integer c = Integer.valueOf(a);

        //AutoUnboxing
        int d = c;
        System.out.println(d);
        System.out.println(c.toString());
//        System.out.println(d.toString()); error

        //Unboxing
        int i = c.intValue();
    }
}
