public class reverseDig {
    public static void reverse(int num) {
     int d,r=0;
     for(;num!=0;){
        d=num%10;
        r=r*10+d;
        num=num/10;
     }
     System.out.println(r);
    }

    public static void main(String[] args) {
        int num = 123;
        reverse(num);
    }

}
