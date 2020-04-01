import java.util.*;
class friendlyPairs
{
    public static void main(String[] args)
    {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int sum1 = 0, sum2 = 0;
        for(int i = 1; i < num1; i++)
        {
            if(num1 % i == 0)
            {
                sum1 = sum1 + i;
            }
        }
        for(int i = 1; i < num2; i++)
        {
            if(num2 % i == 0)
            {
                sum2 = sum2 + i;
            }
        }
        if(sum1 == num1 && sum2 == num2)
            System.out.print("Friendly Pair");
        else
            System.out.print("Not Friendly Pair");
    }
}
