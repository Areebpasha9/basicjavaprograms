public class secondLarge {
    public static void main(String[] args) {
        int ar[]={2,4,44,1,6,4,9};
        int temp=0;
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]>ar[j]){
                 temp=ar[i];
                 ar[i]=ar[j];
                 ar[j]=temp;            
                
                }
            }
            
         }
      System.out.println(ar[ar.length-2]);
        }
    
}
