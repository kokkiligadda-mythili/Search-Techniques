import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int st, mid, end, num, tgt;

        System.out.println("Define the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        System.out.println("Enter the values in sorted array either ascending or descending order: ");
        for (int i = 0; i < num; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        st = 0;
        end = num - 1;
        System.out.println("Define a value to be searched from sorted array: ");
        tgt = scanner.nextInt();

        while (st <= end) {
            mid = (st + end) / 2;
            if (arr[mid] == tgt) {
                System.out.println("Element is found at index " + mid);
                System.exit(0);
            } else if (tgt > arr[mid]) {
                st = mid + 1;
            } else if (tgt < arr[mid]) {
                end = mid - 1;
            }
        }
        System.out.println("Number is not found.");
    }
}
