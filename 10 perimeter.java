
import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int n4 = sc.nextInt();
            int peri = n1+n2+n3+n4;
            System.out.println(peri);
        }
    }
}
