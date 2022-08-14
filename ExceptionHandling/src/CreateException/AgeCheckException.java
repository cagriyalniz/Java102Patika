package CreateException;

public class AgeCheckException extends Exception{
    public AgeCheckException(String message) {
        super(message);
    }
        @Override
        public String toString(){
            return ("Bu ageCheck sinifina ait bir hatadir");
        }

}
