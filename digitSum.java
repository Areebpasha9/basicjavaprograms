public class digitSum {
 public static int sum(int n){
    int d,s=0;
    for(;n!=0;){
     d=n%10;
     s=s+d;
     n=n/10;
    }
    return s;
 }
    public static void main(String[] args) {
        int num=425;
        sum(num);
        System.out.println(sum(num));
    }
}
