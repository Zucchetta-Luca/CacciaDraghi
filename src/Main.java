import java.util.Scanner;

public class Main {

    void Main(String[] args) {
        Scanner inTastiera= new Scanner(System.in);

        int count=inTastiera.nextInt();
        Thread drago= new Thread(new ContatoreRunnable("leonardo", count));

        drago.start();
    }

}