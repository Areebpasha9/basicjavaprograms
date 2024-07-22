public class rightrotate {
    public static void rightRotate(int ar[],int n,int k){
 
        //if rotation is greater then size of array
        k=k%n;
        for(int i=0;i<n;i++){
            if(i<k){
                System.out.println(ar[n+i-k]+" ");
               
            }
            else{
                System.out.println(ar[i-k]+" ");
            }
        }


    }
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5};
        int n=ar.length;
        int k=2; 

        rightRotate(ar,n,k);
    }
    
}
