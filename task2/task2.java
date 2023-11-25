package task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int random = in.nextInt();
        int min=in.nextInt();
        int max=in.nextInt();
        System.out.println("the array size ");
        int n=in.nextInt();
        int [] array = new int[n];
        Reverse(num);
        RandomNum(random);
        RandomMinMax(min, max);
        RandomCharacter();
        PrintArray(array);
    }

    public static void RandomMinMax(int num1, int num2) {
        int random = 0;
        if (num1 < num2) {
            random = (int) (Math.random() * num2) + num1;
        }
        if (num1 > num2) {
            random = (int) (Math.random() * num1) + num2;
        }
        System.out.println(random);
    }

    public static void RandomNum(int num) {
        num = (int) (Math.random() * num) + 1;
        System.out.println(num);
    }
    public static void Reverse(int num) {
        int result = 0;
        while (num > 0) {
            result = (num % 10) + (result * 10);
            num = num / 10;
        }
        System.out.println(result);
    }
    public static void RandomCharacter() {
        int random = (int) (Math.random() * 26) + 'a';
        System.out.println((char) random);
}
public static void PrintArray(int[] array) {
    System.out.println(array);
}
}
