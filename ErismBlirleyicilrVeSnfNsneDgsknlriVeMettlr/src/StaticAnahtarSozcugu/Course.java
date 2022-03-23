package StaticAnahtarSozcugu;

public class Course {
    public String name;
    public String code;
    public int note;

    public Course(String name, String code, int note){
        this.name = name;
        this.code = code;
        this.note = note;
    }

    public static void Calculate(int[] notes){
        double averag = 0;
        int tota = 0;
        for(int i : notes)
            tota += i;

        averag = tota/notes.length;
        System.out.println("ortalama: " + averag);

    }

    public static void CalculateDif(Course[] lesson){
        double average = 0;
        double total = 0;
        for(Course i : lesson)
            total += i.note;
        average = total/ lesson.length;
        System.out.println("ortalamasi: " + average);
    }

}
