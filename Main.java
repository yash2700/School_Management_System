import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Teacher shankar = new Teacher(1,"shankar",500);
        Teacher srijya = new Teacher(2,"srijya",700);
        Teacher Divya = new Teacher(3,"Divya",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(shankar);
        teacherList.add(srijya);
        teacherList.add(Divya);


        Student tamasha = new Student(1,"Tamasha",4);
        Student rakshith = new Student(2,"Rakshith ",12);
        Student rabbi = new Student(3,"Rabbi",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(tamasha);
        studentList.add(rabbi);
        studentList.add(rakshith);




        School ghs = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        ghs.addTeacher(megan);


        tamasha.payFees(5000);
        rakshith.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        shankar.receiveSalary(shankar.getSalary());
        System.out.println("GHS has spent for salary to " + shankar.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        srijya.receiveSalary(srijya.getSalary());
        System.out.println("GHS has spent for salary to " + srijya.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(rakshith);

        Divya.receiveSalary(Divya.getSalary());

        System.out.println(Divya);


    }
}
