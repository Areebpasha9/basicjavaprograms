public class swapNum {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 24;
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("First Number :" + num1);
        System.out.println("Second number" + num2);
    }

}
