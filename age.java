
import java.util.Scanner;

public class age {
  public static void main(String[] args) 
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age=");
        age = sc.nextInt();
        if (age >= 18)
        {
            System.out.println("the user is not a minor!");
        }
        else
        {
            System.out.println("the user is a minor!");
        }
    }
}