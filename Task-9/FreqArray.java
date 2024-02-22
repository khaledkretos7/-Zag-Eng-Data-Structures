import java.util.Scanner;

public class FreqArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int[] FreqArray = new int[26];

        for (int i = 0; i < s.length(); i++) {
            FreqArray[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (FreqArray[i] != 0 && FreqArray[i] == 1) {
                System.out.println((char) (i + 'a'));
                break;
            }
        }
        in.close();
    }
}