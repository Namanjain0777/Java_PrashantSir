
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int b = sc.nextInt();
            int h = sc.nextInt();
            double area = 0.5 * b * h;
            System.out.println("Area of Triangle is " + area);
        }
    }
}
