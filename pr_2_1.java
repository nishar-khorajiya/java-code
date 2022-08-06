
import java.util.*;

public class pr_2_1 {
    static double radius;

    pr_2_1() {
        radius = 1;

    }

    pr_2_1(double r) {
        radius = r;
    }

    public static double getArea() {
        double area = ((double) 3.14) * radius * radius;
        return area;
    }

    public static double getPerimeter() {
        double peri;
        peri = 2 * ((double) 3.14) * radius;
        return peri;
    }

    public static void main(String[] args) {
        double radius, area, peri;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the radius of the circle :");
        radius = s.nextDouble();

        pr_2_1 d1 = new pr_2_1(radius);
        area = pr_2_1.getArea();
        peri = pr_2_1.getPerimeter();

        System.out.println("The area of the given circle is :" + area);
        System.out.println("The perimeter of the given circle is :" + peri);
    }
}
