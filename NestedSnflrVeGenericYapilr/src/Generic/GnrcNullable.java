package Generic;

public class GnrcNullable <T> {
    private final T value;

    public GnrcNullable(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void run(){
        if (isNull())
            System.out.println("deger atamas yok. hic mi yok? hic yok!");
        else
            System.out.println(this.getValue());
    }

    public boolean isNull(){
        return this.getValue() == null;
    }
}
