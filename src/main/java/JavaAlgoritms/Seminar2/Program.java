package JavaAlgoritms.Seminar2;

public class Program {
    public static void main(String[] args) {
        int size = (int) (Math.random() * 20);
        System.out.println(size);
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("Generate massive:");
        printArray(array);

        HeapSort ob = new HeapSort();
        ob.sort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

    static void printArray(int array[]) {
        for (int el : array) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}

class HeapSort {
    public void sort(int array[]) {
        int size = array.length;
        for (int i = size / 2 - 1; i >= 0; i--)
            heap(array, size, i);
        for (int i = size - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heap(array, i, 0);
        }
    }

    void heap(int array[], int size, int i) {
        int large = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && array[left] > array[large])
            large = left;
        if (right < size && array[right] > array[large])
            large = right;

        if (large != i) {
            int swap = array[i];
            array[i] = array[large];
            array[large] = swap;

            heap(array, size, large);
        }
    }
}


