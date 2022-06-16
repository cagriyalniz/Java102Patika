package NestedAndInnerClass;

public class Main {
    public static void main(String[] args) {
        Out o = new Out();
        o.run();

        Out.In oi = o.new In();
        oi.run();

        o.getIn().run();

        Out.StaticIn.runForStatic();

        Local lcl = new Local();
        lcl.run();

        Anonim a = new Anonim();
        a.run();

        Anonim annm = new Anonim(){
            @Override
            public void run(){
                System.out.println("maindeki run");
            }
        };
        annm.run();
    }
}
