import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int[] freq = new int[27];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.println((char) (i + 'a') + " :" + freq[i]);
            }
        }
        in.close();
    }
}
