import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex82 {
    public static void ex82Vetor() {
        int[] A = new int[10];
        int[] M = new int[10];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Insira um número para X:");
        int X = scanner.nextInt();

        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(21);
            M[i] = A[i] * X;
        }
        System.out.println("vetor A:" + Arrays.toString(A));
        System.out.println("vetor M:" + Arrays.toString(M));
    }

    public static void ex82Array() {
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> M = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Insira um número para X:");
        int X = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            A.add(random.nextInt(21));
            M.add(A.get(i) * X);
        }
        System.out.println("vetor A:" + A.toString());
        System.out.println("vetor M:" + M.toString());
    }
}