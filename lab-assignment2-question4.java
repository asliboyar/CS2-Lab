import java.util.Scanner;
public class Handshakes{
    public static void main(String[] args){
        int numstudents;
        Scanner sc = new Scanner(System.in);
        numstudents = sc.nextInt();
        int total = numstudents * (numstudents-1) / 2; 
        System.out.print("Total Handshakes are " +total);
        sc.close();
    }
}
