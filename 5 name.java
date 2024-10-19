import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("Enter Name:- ");
            String name = sc.next();
            System.out.println("Welcome "+ name + " To KG Coding");
        }
    }
}
