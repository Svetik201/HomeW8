public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.");

        int [] box = new int [3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;
        System.out.println(box[0]);
        System.out.println(box[1]);
        System.out.println(box[2]);


        System.out.println("  ");


        double [] box1 = { 1.57, 7.654, 9.986 };
        box1[0] = 1.57;
        box1[1] = 7.654;
        box1[2] = 9.986;
        System.out.println(box1[0]);
        System.out.println(box1[1]);
        System.out.println(box1[2]);

        System.out.println("Задание 2.");

        int[] apple  = {12, 45, 98, 82, 86, 32, 20, 99, 65, 7, 4, 678};
        for (int a = 0; a < apple.length; a++) {
            System.out.print(apple[a] + "  ");
        }

        System.out.print("  ");
        System.out.println();

        System.out.println("Задание 3.");

        System.out.println(box[2]);
        System.out.println(box[1]);
        System.out.println(box[0]);

        System.out.print("  ");
        System.out.println();

        System.out.println(box1[2]);
        System.out.println(box1[1]);
        System.out.println(box1[0]);

        System.out.println("Задание 4.");

        int [] milk = {20, 25, 34, 37, 40, 41, 44, 53, 54, 61, 62,77};
        int d = milk[2];
        for (int plum = 0; plum < milk.length; plum = plum + 2) {
            if (plum == milk.length + 2) {
                System.out.println(milk[plum]);
                break;
            }
            System.out.print(milk[plum] + "  ");
            }
        }
    }
