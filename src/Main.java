//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2= new Student();

        s1.age = 10;
        s1.name = "A";
        s1.display();

        s2 = s1;
        s2.age = 20;
        s2.name = "B";

        s2.display();
        s1.display();

        Student s3 = new Student();
        s3.age = 10;
        s3.name = "A";

        Student s4 = new Student();
        Student temp = s3;
        s4 = s3;
        s3 = temp;
        s4.display();
    }
}