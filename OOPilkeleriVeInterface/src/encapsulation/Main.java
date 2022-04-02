package encapsulation;

public class Main {
    public static void main(String[] args) {

        Book newBook = new Book("Serguzest", 250);

        System.out.println(newBook.name);
        //newBook.pageNumber = -15;
        //System.out.println(newBook.pageNumber);

        newBook.ChangeNumber(-1);
        newBook.ShowNumber();
        newBook.ChangeName("yaban");
        System.out.println(newBook.ShowName());

    }

}
