package week5;
import java.util.Arrays;
import java.util.Scanner;

public class Latihan3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen: ");
        int angka = input.nextInt();
        
        int[] data = new int[angka];
        System.out.println("Masukkan " + angka + " angka:");
        for (int i = 0; i < angka; i++) {
            data[i] = input.nextInt();
        }

        int[] bubbleData = Arrays.copyOf(data, data.length);
        bubbleSort(bubbleData);

        int[] quickData = Arrays.copyOf(data, data.length);
        System.out.println("\nQuick Sort:");
        quickSort(quickData, 0, quickData.length - 1);

        int[] insertionData = Arrays.copyOf(data, data.length);
        insertionSort(insertionData);

        int[] selectionData = Arrays.copyOf(data, data.length);
        selectionSort(selectionData);

        int[] mergeData = Arrays.copyOf(data, data.length);
        System.out.println("\nMerge Sort:");
        mergeSort(mergeData, 0, mergeData.length - 1);
        
        input.close();
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        System.out.println("\nBubble Sort:");
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                printArray(arr);
            }
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            printArray(arr);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                printArray(arr);
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void insertionSort(int[] arr) {
        System.out.println("\nInsertion Sort:");
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                printArray(arr);
            }
            arr[j + 1] = key;
            printArray(arr);
        }
    }

    public static void selectionSort(int[] arr) {
        System.out.println("\nSelection Sort:");
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
            printArray(arr);
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
            printArray(arr);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, l, L, 0, n1);
        System.arraycopy(arr, m + 1, R, 0, n2);

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
