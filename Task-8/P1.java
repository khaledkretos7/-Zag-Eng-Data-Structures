import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2;
        n1 = in.nextInt();
        n2 = in.nextInt();

        int[] array = new int[n1];
        int[] freq = new int[n2 + 1];

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
            freq[array[i]]++;
        }

        for (int i = 1; i < freq.length; i++) {
            System.out.println(freq[i]);
        }
        in.close();
    }
}