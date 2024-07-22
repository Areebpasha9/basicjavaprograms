public class fact {
    public static int getFact(int num){
        int factorial=1;
        for(;num>0;num--){
           factorial=factorial*num;
        }
        return factorial;
    }
    public static void main(String[] args) {
        int num=4;
          int res=  getFact(num);
          System.out.println("Factoral of Number is :"+res);
    }
}
