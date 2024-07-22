package pattern;

public class random {
    public static void main(String[] args) {
        int k=0;
        for(int i=1;i<=7;i++){
            k+=(i<=4) ?1:-1;
            for(int j=1;j<=4;j++){
                 if(j>=1 && j<=k ){
                    System.out.print("*");
                 
                }
                 else{
                    System.out.print(" ");
               
                }
            }
            System.out.println();
        }
    }
}
