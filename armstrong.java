import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int n, num, arm = 0, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        n = sc.nextInt();
        num = n;
        for (; n != 0;) {
            k = n % 10;
            arm = arm + (k * k * k);
            n = n / 10;
        }
        if (num == arm) {
            System.out.println(num + " is a arm Strong number");
        }else{
            System.out.println(num+" is Not armstrong number");
        }
    }

}
