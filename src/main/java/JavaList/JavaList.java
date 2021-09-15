package JavaList;

import java.util.LinkedList;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < N; i++) {
            int value = scanner.nextInt();
            list.add(value);
        }

        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            String action = scanner.next();
            if (action.equals("Insert")) {
                int ind = scanner.nextInt();
                int value = scanner.nextInt();
                list.add(ind, value);
            } else {
                int ind = scanner.nextInt();
                list.remove(ind);
            }
        }
        scanner.close();

        for (Integer number : list) {
            System.out.print(number + " ");
        }
    }
}
