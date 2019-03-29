import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        String a1 = in.next();
        A a = new A(a1);
        Thread1 thread1 = new Thread1(a);
        thread1.start();
        Thread2 thread2 = new Thread2(a);
        thread2.start();
        Thread3 thread3 = new Thread3(a);
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(Thread.currentThread().getName() + a.string);
   }
}
class Thread1 extends Thread {

    private A str;

    public Thread1(A str) {
        this.str = str;
    }
    @Override
    public void run() {
        str.string = str.string +"_A";
        System.out.println(Thread.currentThread().getName()+str.string);
    }
}
class Thread2 extends Thread {

    private A str;

    public Thread2(A str) {
        this.str = str;
    }
    @Override
    public void run() {
       str.string = str.string +"_B";
        System.out.println(Thread.currentThread().getName()+str.string);
    }
}
class Thread3 extends Thread {

    private A str;

    public Thread3(A str) {
        this.str = str;
    }
    @Override
    public void run() {
        str.string = str.string+"_C";
        System.out.println(Thread.currentThread().getName()+str.string);
    }
}
class A {
    public  String string;

    public A(String string) {
        this.string = string;
    }

}