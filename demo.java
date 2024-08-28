/**
 * demo
 */
public class demo {

  public static void main(String[] args) {
    int ar[]={1,2,1,3,4,1,2,5};
    for(int i=0;i<ar.length;i++){
      boolean flag=false;
      if(ar[i]==-1){
        continue;
      }
      for(int j=i+1;j<ar.length;j++){
        if (ar[i]==ar[j]) {
          ar[j]=-1;
          flag=true;
          
        }
      }
      if (flag) {
        System.out.println(ar[i]);
      }
    }
  }
}