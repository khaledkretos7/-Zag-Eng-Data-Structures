import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                for (int j = 0; j < freq[i]; j++) {
                    System.out.print((char) (i + 'a'));
                }
            }
        }
        in.close();
    }
}
