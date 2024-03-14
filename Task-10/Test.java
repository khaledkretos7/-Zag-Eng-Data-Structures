import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int[] arr = {1,2,2,3,3,3,4,9,16,16,16,16};
        occurrence(s);
        System.out.println(notRepeated(s));
        System.out.println(moreFrq(arr));

        in.close();
    }

    public static int moreFrq (int[] arr) {
        ChainingHashTable hash = new ChainingHashTable(10);

        int frq = 0;
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            hash.integerValue(key);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!hash.nullIndex(arr[i]) && hash.getinteger(arr[i]) > frq) {
                frq = hash.getinteger(arr[i]);
                max = arr[i];
            }
        }
        return max;
    }

    public static void occurrence (String s) {
        LinearHashTable table = new LinearHashTable(26);
        System.out.print("[ ");
        for (int i = 0; i < s.length(); i++) {
            int key = s.charAt(i) - 'a';
            table.IntegerValue(key);
        }
        for (int i = 0; i < table.size(); i++) {
            if (!table.nullIndex(i))
                System.out.print((char)(i+'a')+ ":" + table.getInteger(i) + " ");
        }
        System.out.println("]");
    }

    public static char notRepeated (String s) {
        LinearHashTable hash = new LinearHashTable(26);

        for (int i = 0; i < s.length(); i++) {
            int key = s.charAt(i) - 'a';
            hash.IntegerValue(key);
        }
        for (int i = 0; i < s.length(); i++) {
            int key = s.charAt(i) - 'a';
            if (hash.getInteger(key) == 1)
                return (char) s.charAt(i);
        }
        return 0;
    }

}
