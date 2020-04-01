import java.util.*;
public class handshakes
{
    public static void main(String[] args)
    {
        int numberOFStudents;
        Scanner sc = new Scanner(System.in);
        numberOFStudents = sc.nextInt();
        int total = numberOFStudents * (numberOFStudents-1) / 2; 
        System.out.print("Number of Handshakes is " +total);
        sc.close();
    }
}
