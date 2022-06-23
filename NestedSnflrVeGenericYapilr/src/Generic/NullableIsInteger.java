package Generic;

public class NullableIsInteger {
    private final Integer value;

    public NullableIsInteger(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public  boolean isNull(){
        return (this.getValue() == null);
    }

    public void run(){
        if (isNull())
            System.out.println("bu degiskene deger atanmamistir");
        else
            System.out.println(this.getValue());
    }
}
