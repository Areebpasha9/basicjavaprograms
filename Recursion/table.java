package Recursion;

public class table {
    public static void printTable(int n,int i){
        if(i>10){
            return;

        }
        System.out.println(n+"*"+i+"="+n*i);
        printTable(n, i+1);

    }
    public static void main(String[] args) {
        int num=5,i=1;
        printTable(num,i);
    }
}
