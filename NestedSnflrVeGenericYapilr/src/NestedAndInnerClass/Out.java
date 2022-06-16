package NestedAndInnerClass;
//outer class
public class Out {
    public int a = 5;
    //inner class
    public class In{
        public int a = 10;

        public void run(){
            int a = 1;
            System.out.println("Out-In in icindeki run fonksiyonu calisti: ");
            System.out.println("Out in icindeki run fonksiyonundaki a: " + a);
            System.out.println("Out in icindeki run fonksiyonunda this.a: " + this.a);
            System.out.println("Out in icindeki run fonksiyonunda Out.this.a print edildi: " + Out.this.a);

        }
    }

    public static class StaticIn{
        public int a = 10;

        public static void runForStatic(){
            int a = 1;
            System.out.println("Out-StaticIn in icindeki runForStatic fonksiyonu calisti ");
            System.out.println("Out StaticInicindeki runForStatic fonksiyonundaki a: " + a);
            //System.out.println("Out in icindeki run fonksiyonunda this.a: " + this.a);


        }
    }

    public void runForStatic(){
        StaticIn.runForStatic();
    }

    public void run(){

        In in = new In();
        System.out.print("out clasının run fonksiyonu calisti: ");
        in.run();
    }

    public In getIn(){
        System.out.println("Out clasının getIn fonksiyonu calisti ve  in objesi return etti");
        In in = new In();
        return in;
    }
}
