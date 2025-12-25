public class calculateSum {
    public static int reduceToZero(int num){

        while (num>10) {
            int sum=0;
            while (num>0) {
                sum+=num%10;
                num=num/10;
            }
            num=sum;
            
        }
        return num;

    }
public static void main(String[] args) {
    int num=123556;
    System.out.println(reduceToZero(num));

}
}