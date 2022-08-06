import java.util.Scanner;

public class pr_2_5 {
    public static void information(String roll_no, String name, String branch) {
        System.out.println("The name of the Student is :" + name);
        System.out.println("The roll no of the student is " + roll_no);
        System.out.println(name + " studies in " + branch);
    }

    public static void information(String name, String degree, String faculty_of, int experience, long salary) {
        System.out.println("Name of the professor is :" + name);
        System.out.println(name + " has compleated " + degree);
        System.out.println(name + "have " + experience + " years of teaching");
        System.out.println(name + " teaches in " + faculty_of);
        System.out.println(name + " has been given " + salary + " rs of salary per year");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name_std, roll_no_std, branch_std, faculty_of_pro, name_pro, degree_pro;
        int experience;
        long salary;
        System.out.println("Taking information of student :");
        System.out.print("Name of student :");
        name_std = s.next();
        System.out.print("Roll no of student :");
        roll_no_std = s.next();
        System.out.print("Branch student studies in :");
        branch_std = s.next();
        System.out.println("------------------------------------------------------------------");
        System.out.println("Taking information for faculty :");
        System.out.print("Name of professor :");
        name_pro = s.next();
        System.out.print("Degree of professor :");
        degree_pro = s.next();
        System.out.print("Experience of teaching :");
        experience = s.nextInt();
        System.out.print("Teaches in :");
        faculty_of_pro = s.next();
        System.out.print("His/her salary :");
        salary = s.nextLong();
        System.out.println("------------------------------------------------------------------");
        System.out.println("The given information of student is :");
        pr_2_5.information(roll_no_std, name_std, branch_std);
        System.out.println("------------------------------------------------------------------");
        System.out.println("The given information of professor is :");
        pr_2_5.information(name_pro, degree_pro, faculty_of_pro,
                experience, salary);
    }
}
