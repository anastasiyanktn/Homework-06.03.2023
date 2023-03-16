import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] boxes = new int[4];
        boxes[0] = 1;
        boxes[1] = 2;
        boxes[2] = 3;
        int firstBox = boxes[0];
        int secondBox = boxes[1];
        int thirdBox = boxes[2];
        System.out.println(firstBox);
        System.out.println(secondBox);
        System.out.println(thirdBox);

        double[] bigBox = {1.57, 7.654, 9.986};
        System.out.println(bigBox[0]);
        System.out.println(bigBox[1]);
        System.out.println(bigBox[2]);

        int[] colors = {94, 95, 96};
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);

    }


    public static void task2() {
        System.out.println("Задача 2");
        int[] boxes = new int[3];
        boxes[0] = 1;
        boxes[1] = 2;
        boxes[2] = 3;
        int firstBox = boxes[0];
        int secondBox = boxes[1];
        int thirdBox = boxes[2];
        System.out.println(Arrays.toString(boxes));


        double[] bigBox = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(bigBox));


        int[] colors = {94, 95, 96};
        System.out.println(Arrays.toString(colors));

    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] boxes = new int[3];
        boxes[0] = 1;
        boxes[1] = 2;
        boxes[2] = 3;
        for (int i = boxes.length - 1; i >= 0; i--) {
            System.out.print(boxes[i] + ",");

        }
        System.out.println();


        double[] bigBox = {1.57, 7.654, 9.986};
        for (int i = bigBox.length - 1; i >= 0; i--) {
            System.out.print(bigBox[i] + ",");
        }
        System.out.println();

        int[] colors = {94, 95, 96};
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.print(colors[i] + ", ");

        }
        System.out.println();

    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] array = {94, 95, 96, 98, 100, 124, 128};
        for (int i = 0; i < array.length; i++) {
            if (array [i] %2 == 0) {
                continue;
            }
            array[i] +=1;
        }
        System.out.println(Arrays.toString(array));
    }
}




