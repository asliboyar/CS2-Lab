import java.util.Scanner;
public class ArmsNumbers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        for(int temp = 0; temp < 10000; temp++){
            int temp1;
            int count=0;
            int a,total=0;
            temp1 = temp;
            while(temp1 != 0){
                temp1/=10;
                count++;
            }
            temp1= temp;

            while(temp1 != 0) {
                a = temp1 % 10;
                total += (int) Math.pow(a,count);
                temp1 /=10;
            }
            if(total == temp)
                System.out.println(temp+ " is Armstrong number");
        }



    }
}
