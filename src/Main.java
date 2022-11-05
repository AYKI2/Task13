import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static Random random = new Random();
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.print();

        MyClass myClass2 = new MyClass("Исхак","",15,"Манты и Оромо");
        myClass2.print();

        MyClass myClass1 = new MyClass("Исхак","Абдухамитов",20, new String[]{"Technical Lesson", "Practic Lesson", "English", "SoftSkills"},"Манты и Оромо");
        myClass1.print();
    }
}