import java.util.Scanner;
public class FriendlyPairs {
    public static void main(String[] args){
        int x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        int sum1 = 0, sum2 = 0;
        for(int i = 1; i < x; i++)
        {
            if(x % i == 0)
            {
                sum1 = sum1 + i;
            }
        }
        for(int i = 1; i < y; i++)
        {
            if(y % i == 0)
            {
                sum2 = sum2 + i;
            }
        }
        if(sum1 == x && sum2 == y)
            System.out.print(x +" and "+ y +" are friendly pair");
        else
            System.out.print(x +" and "+ y +" are not friendly pair");
    }
}
