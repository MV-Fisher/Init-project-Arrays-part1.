import java.util.Arrays ;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Задача № 1.");
        int[] maiArrays = new int[]{1, 2, 3};
        double[] maiArrays2 = new double[]{1.57, 7.654, 9.986};
        char[] maiArrays3 = new char[]{'a', 'q', 'm', 'v', 'f'};
        System.out.println(Arrays.toString(maiArrays));
        System.out.println(Arrays.toString(maiArrays2));
        System.out.println(Arrays.toString(maiArrays3));
    }
    public static void task2() {
        System.out.println("Задача № 2.");
        int[] maiArrays = new int[]{1, 2, 3};
        System.out.print(maiArrays[0] + ", ");
        System.out.print(maiArrays[1] + ", ");
        System.out.print(maiArrays[2]);
        System.out.println();
        double[] maiArrays2 = new double[]{1.57, 7.654, 9.986};
        System.out.print(maiArrays2[0] + ". ");
        System.out.print(maiArrays2[1] + ". ");
        System.out.print(maiArrays2[2]);
        System.out.println();
        char[] maiArrays3 = new char[]{'a', 'q', 'm', 'v', 'f'};
        System.out.print(maiArrays3[0] + ". ");
        System.out.print(maiArrays3[1] + ". ");
        System.out.print(maiArrays3[2] + ". ");
        System.out.print(maiArrays3[3] + ". ");
        System.out.print(maiArrays3[4]);
        System.out.println();
        //Задачу считаю решённой, но метод решения мнее не нравится.
    }
    public static void task3() {
        System.out.println("Задача № 3.");
        int[] maiArrays = new int[]{1, 2, 3};
        System.out.print(maiArrays[2] + ", ");
        System.out.print(maiArrays[1] + ", ");
        System.out.print(maiArrays[0]);
        System.out.println();
        double[] maiArrays2 = new double[]{1.57, 7.654, 9.986};
        System.out.print(maiArrays2[2] + ". ");
        System.out.print(maiArrays2[1] + ". ");
        System.out.print(maiArrays2[0]);
        System.out.println();
        char[] maiArrays3 = new char[]{'a', 'q', 'm', 'v', 'f'};
        System.out.print(maiArrays3[4] + ". ");
        System.out.print(maiArrays3[3] + ". ");
        System.out.print(maiArrays3[2] + ". ");
        System.out.print(maiArrays3[1] + ". ");
        System.out.print(maiArrays3[0]);
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача № 4 .");
        int[] maiArrays4 = {1, 5, 8, 15, 29, 45, 7, 11, 6, 31, 99, 13, 4, 9, 15, 50, 91, 78, 21, 63};
        for (int i = 0; i < maiArrays4.length; i++) {
                if (maiArrays4[i] % 2 != 0) {
                    maiArrays4[i] = maiArrays4[i] + 1;
                }
            }
        System.out.println(Arrays.toString(maiArrays4));
        }
}
// Домашнее задание считаю выполненным.
