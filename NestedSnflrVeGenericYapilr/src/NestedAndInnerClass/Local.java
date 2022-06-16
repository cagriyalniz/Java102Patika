package NestedAndInnerClass;

public class Local {
    public void run(){

        class Yerel{
            private int a;
            public Yerel(int a){
                this.a = a;
            }

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }
        }
        Yerel y = new Yerel(16);
        System.out.println("local sinifi calisti");
        System.out.println(y.getA());
    }
}
