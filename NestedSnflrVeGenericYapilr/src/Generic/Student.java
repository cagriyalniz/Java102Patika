package Generic;

public class Student<T> implements IDatabase<T>{
    @Override
    public boolean insert(T data) {
        System.out.println("data inserted");
        return true;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("data deleted");
        return true;
    }

    @Override
    public boolean update(T data) {
        System.out.println("data updated");
        return true;
    }

    @Override
    public T select() {
        System.out.println("data selected");
        return null;
    }


}
