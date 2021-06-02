package cs.vsu.ru.bredikhina;


public class QuickSort {

    public static int First;
    public static int Last;
    public static int Med;

    public static void quickSortFirst(int[] arr, int left, int right) {
        if (left < right) {
            First += (right - left - 1);
            int pivot = partitionFirst(arr, left, right);
            quickSortFirst(arr, left, pivot);
            quickSortFirst(arr, pivot + 1, right);
        }
    }

    public static void quickSortLast(int[] arr, int left, int right) {
        if (left < right) {
            Last += (right - left - 1);
            int pivot = partitionLast(arr, left, right);
            quickSortLast(arr, left, pivot);
            quickSortLast(arr, pivot + 1, right);
        }
    }

    public static void quickSortMed(Integer[] arr, int left, int right) {
        if (left < right) {
            Med += (right - left - 1);
            int pivot = partitionMed(arr, left, right);
            quickSortMed(arr, left, pivot);
            quickSortMed(arr, pivot + 1, right);
        }
    }

    public static int partitionFirst(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left + 1;

        for(int j = left + 1; j < right; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, left, i - 1);
        return i - 1;
    }

    public static int partitionLast(int[] arr, int left, int right) {
        int pivot = arr[right - 1];
        arr[right - 1] = arr[left];
        arr[left] = pivot;
        int i = left + 1;

        for(int j = left + 1; j < right; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, left, i - 1);
        return i - 1;
    }

    public static int partitionMed(Integer[] arr, int left, int right) {
        int x = arr[left];
        int y = arr[right - 1];
        int length = right - left;
        int mid;
        if (length % 2 == 0) {
            mid = arr[left + (length/2 - 1)];
        }
        else
            mid = arr[left + (length/2)];

        int pivot = median(x, y, mid);
        int pivInd = java.util.Arrays.asList(arr).indexOf(pivot);

        arr[pivInd] = arr[left];
        arr[left] = pivot;

        int i = left + 1;

        for(int j = left + 1; j < right; j++) {
            if (arr[j] < pivot) {
                listSwap(arr, i, j);
                i++;
            }
        }
        listSwap(arr, left, i - 1);
        return i - 1;
    }

    public static int median(int x, int y, int z) {
        if ((x - y) * (z - x) >= 0) {
            return x;
        }
        else if ((y - x) * (z - y) >= 0) {
            return y;
        }
        else
            return z;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void listSwap(Integer[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}