package Generic;

public class GenericBounded <T> extends Number{// T yerine gel deger sadece number olabilir
    private final T value;

    public GenericBounded(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isNull(){
        return this.getValue() == null;
    }

    public void run (){
        if(isNull()){
            System.out.println("bu degiskene deger atanmamis: null");
        }
        else
            System.out.println(this.getValue());
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
