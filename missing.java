public class missing {
    public static void main(String[] args) {
        int ar[]={1,2,3,5};
        int sum=0,sum2=0;
        for(int i=0;i<ar.length;i++){
            sum+=ar[i];
        }
        for(int j=1;j<=5;j++){
          sum2+=j;
        }
        System.out.println(sum2-sum);
    }
    
}
