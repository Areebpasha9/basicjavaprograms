package pattern;

public class fib {
    public static void getFib(int num1, int num2) {
        
        for(int i=1;i<=8;i++){
            int nextnum=num1+num2;
            System.out.print(nextnum+" ");
            num1=num2;
            num2=nextnum;
        }
          }

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1+" ");
        System.out.print(num2+" ");
        getFib(num1,num2);
    }

}
