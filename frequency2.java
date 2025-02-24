public class frequency2 {
    public static void main(String[] args) {
        int ar[]={1,2,1,3,1,2,4,5};
        int fr[]=new int[ar.length];

        for(int i=0;i<ar.length;i++){
            int count=1;
            for(int j=i+1;j<ar.length;j++){
                if (ar[i]==ar[j]) {
                    count++;
                    fr[j]=-1;
                }
            }
            if (fr[i]!=-1) {
                fr[i]=count;
            }
        }
        for(int i=0;i<ar.length;i++){
            if (fr[i]!=-1) {
                System.out.println(ar[i]+" ||| "+fr[i]);
            }
        }


    }
    
}
