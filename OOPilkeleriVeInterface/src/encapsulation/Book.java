package encapsulation;

public class Book {
    public String name;
    private int pageNumber;

    Book(String name, int pageNumber){
        this.name = name;
        if(pageNumber < 0)
            pageNumber = 0;
        this.pageNumber = pageNumber;
    }

    public void ChangeNumber(int number) {
        this.pageNumber = number;
        if(this.pageNumber < 0)
            this.pageNumber = 0;
    }

    public void ShowNumber(){
        System.out.println(this.pageNumber);
    }

    //setter: setname
    public void ChangeName(String name){
        this.name = name;

    }
    //getter: getname
    public String ShowName(){
        return this.name;
    }
}
