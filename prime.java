public class prime {
    public static void main(String[] args) {

        int num = 21, m = 0, flag = 1;
        m = num / 2;

        if (num == 0 || num == 1) {
            System.out.println("Not a prime number");
        } else {
            for (int i = 2; i <= m; i++) {
                if (num % 2 == 0) {
                    flag = 0;
                    break;
                }
            }
        }
       if(flag==1){
        System.out.println(num+" is Prime Number");
       }
       else{
        System.out.println(num+"is Not a prime number");
       }
    }

}
