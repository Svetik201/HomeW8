import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.");

        int[] box = new int[3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;
        System.out.println(box[0]);
        System.out.println(box[1]);
        System.out.println(box[2]);


        System.out.println("  ");


        double[] box1 = {1.57, 7.654, 9.986};
        box1[0] = 1.57;
        box1[1] = 7.654;
        box1[2] = 9.986;
        System.out.println(box1[0]);
        System.out.println(box1[1]);
        System.out.println(box1[2]);

        System.out.println("Задание 2.");

        int[] number = {1, 2, 3, 10, 5, 6, 7, 8, 9, 18};
        int[] revers = new int[number.length];
        for (int i = 0; i < revers.length; i++) {
            revers[i] = number[number.length - 1 - i];
        }
        System.out.println(Arrays.toString(number));


        System.out.println("Задание 3.");

        int[] numbers = new int[]{1, 2, 3, 10, 5, 6, 7, 8, 9, 18};
        for (int a = numbers.length - 1; a >= 0; a--) {
            System.out.print(numbers[a]);
            if (a >= 0) {
                System.out.print(", ");
            }
        }

        System.out.print("  ");
        System.out.println();

        System.out.println("Задание 4.");

        int[] milk = {20, 26, 34, 38, 40, 42, 44, 56, 54, 60, 62, 78};

        System.out.println(Arrays.toString(milk));

    }

    private static class Array {
    }
}
