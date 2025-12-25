package threading;

class myThread {
    int count=0;
    public void run() {
        for (int i = 0; i <= 10; i++) {
            count++;
        }

        System.out.println(count);
    }
}

public class test {
    public static void main(String[] args) {
        // System.out.println("Areeb");
        myThread th = new myThread();
        myThread t2=new myThread();
        th.run();
        t2.run();
    }

}
