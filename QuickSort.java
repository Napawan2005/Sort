import java.util.Arrays;

public class QuickSort {

    // ฟังก์ชันสำหรับจัดการ pivot และแบ่งลิสต์
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // เลือกตัวท้ายเป็น pivot
        int i = (low - 1); // ดัชนีสำหรับค่าเล็กกว่า pivot

        for (int j = low; j < high; j++) {
            // ถ้าค่าใน arr[j] น้อยกว่า pivot
            if (arr[j] < pivot) {
                i++;
                // สลับตำแหน่ง arr[i] กับ arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // สลับตำแหน่ง pivot กับ arr[i+1]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // คืนค่าดัชนีของ pivot ที่จัดเรียงแล้ว
    }

    // ฟังก์ชันหลักสำหรับ Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // หาดัชนีที่แบ่งลิสต์ด้วย pivot
            int pi = partition(arr, low, high);

            // เรียงลำดับลิสต์ย่อยซ้ายและขวา
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Given Array: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

