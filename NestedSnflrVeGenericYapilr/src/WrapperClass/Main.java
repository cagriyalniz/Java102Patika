package WrapperClass;
//primitif veri türlerindekileri birer objeye cevirmeyi saglarlar
public class Main {
    public static void main(String[] args) {
        int a = 20;
        Integer b = 10001;
        System.out.println(b);
        System.out.println(a + b);
        String str = b.toString();
//      String str2 = a.toString(); error

        for (char c: str.toCharArray()) {
            System.out.println(c);
        }
        System.out.println(str + a);
        System.out.println(Integer.parseInt(str) + a);
        String str3 = "cagri";
//        int c = Integer.parseInt(str3); error
//        System.out.println(c);

        System.out.println(Integer.toBinaryString(2));
        System.out.println(Integer.bitCount(2));
        System.out.println(Integer.rotateLeft(2, 1));

    }
}
