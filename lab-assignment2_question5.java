public class armstrongNumbers {

    public static void main(String[] args) {

        int min = 0, max = 1000;

        for(int num = min + 1; num < max; ++num) {
            int digitsOFnumber = 0;
            int result = 0;
            int initialnumber = num;
            while (initialnumber != 0) {
                initialnumber /= 10;
                ++digitsOFnumber;
            }
            initialnumber = num;
            while (initialnumber != 0) {
                int remainder = initialnumber % 10;
                result += Math.pow(remainder, digitsOFnumber);
                initialnumber /= 10;
            }
            if (result == num)
                System.out.print(num + " ");
        }
    }
}
