import java.util.Scanner;

public class numberofDigits {
    public static void main(String Args[]) {
        System.out.println("Enter a number" );
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        while (num>0)
        {
            num = num/10;
            count++;
        }
        System.out.println("The number of digits is =" +count );
        in.close();
    }
}
