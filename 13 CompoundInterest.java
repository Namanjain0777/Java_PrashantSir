
import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in)
            int p = sc.nextInt();
            double r = sc.nextDouble();
            int t =sc.nextInt();
            double ci = p * Math.pow((1+r/100),t);
            System.out.println(ci);
    }
}

