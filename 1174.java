import java.util.Scanner;
import java.io.IOException;



public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite um numero inteiro.");
        int[] N = new int[10];
        N[0] = leitor.nextInt();
        for (int i = 1; i < 10; i++) {
            N[i] = N[i - 1] * 2;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
    }
}
