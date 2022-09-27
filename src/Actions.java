import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Actions {
    static Scanner in = new Scanner(System.in);

    public static void oddAndEven() {
        int k = in.nextInt();
        int j = in.nextInt();
        int even = 0;
        int odd = 0;
        for (int i = k; i <= j; i++) {
            if (i % 2 == 0) {
                even++;
            } else odd++;
        }
        System.out.println("even: " + even);
        System.out.println("odd: " + odd);
    }


    public static void b() {
        int k;
        int num = 0;
        int result = 0;
        for (int i = 0; i < 5; i++) {
            k = in.nextInt();
            if (i == 0)
                num = k;
            if (num < k) {
                result++;
            }
        }
        System.out.println(result);
    }

    public static void square() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= 7; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("------------------------");
    }
//" \uD83E\uDD73"

    public static void triangle() {
        for (int i = 0; i < 15; i++) {
            System.out.println();
            for (int k = 15 - i; k > 1; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
        }

        System.out.println();
        System.out.println("---------------------------------");
    }

    public static void orthodox() {
        int num = 14;
        for (int i = 0; i < 7; i++) {
            System.out.println(" ");
            for (int p = 0; p < 1; p++) {
                if (i > 0)
                    System.out.print("|");
            }
            for (int i1 = 1; i1 < i; i1++) {
                System.out.print("'");
            }
            for (int k = 0; k < 15; k++) {
                if (k == num && i != 0) {
                    System.out.print("|");
                } else
                    System.out.print("*");
            }
            num--;
        }
        int numb = 6;
        for (int i2 = 0; i2 < 7; i2++) {
            System.out.println();
            for (int i1 = 0; i1 < i2; i1++) {
                System.out.print(" ");
            }
            int k = 0;
            for (k = 0; k < 15; k++) {
                if (k == numb && i2 != 6) {
                    System.out.print("|");
                } else System.out.print("*");
            }
            numb--;
            int i1;
            for (i1 = 5; i1 > i2; i1--) {
                System.out.print("'");
            }
            if (i1 == i2)
                System.out.print("|");
        }
        System.out.println();
        System.out.println("------------------------");
        System.out.println();
    }

    public static void cripto(List<Integer> arr) {
        int balanse = 0;
        int min = arr.get(0);
        int minIndex = 0;
        int max = arr.get(0);
        int maxIndex = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
                minIndex = i;
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
                maxIndex = i;
            }
        }
        if (maxIndex == 0) {
            arr.remove(maxIndex);
            max = arr.get(0);
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) > max)
                    max = arr.get(i);
                maxIndex = i;
            }
        }
        for (int j = 0; j < arr.size(); j++) {
            if (minIndex > maxIndex || minIndex == (arr.size() - 1)) {
                arr.remove(minIndex);
                if (arr.get(j) < min) {
                    min = arr.get(0);
                    min = arr.get(j);
                    minIndex = j;
                }
            }
        }
        for (int i = 1; i < arr.size() - 1; i++) {
            if (arr.get(i) < min) {
                min = arr.get(0);
                min = arr.get(i);
                minIndex = i;
            }
        }

        balanse = (balanse - min) + max;
        System.out.println("Your balans is: " + balanse);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(54);
        arr.add(99);
        arr.add(87);
        arr.add(7);
        arr.add(6);


        triangle();
        orthodox();
        square();
        oddAndEven();
        b();
//        cripto(arr);
    }
}