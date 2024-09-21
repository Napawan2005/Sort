import java.util.Arrays;

public class MergeSort {

    // ฟังก์ชันสำหรับรวมลิสต์ย่อยสองส่วนที่ถูกเรียงแล้ว
    public static void merge(int[] arr, int left, int mid, int right) {
        // ขนาดของลิสต์ย่อยซ้ายและขวา
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // สร้างอาร์เรย์ชั่วคราวสำหรับลิสต์ซ้ายและขวา
        int[] L = new int[n1];
        int[] R = new int[n2];

        // คัดลอกข้อมูลไปยังอาร์เรย์ชั่วคราว
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // รวมข้อมูลจากอาร์เรย์ซ้ายและขวา
        int i = 0, j = 0;
        int k = left;
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

        // คัดลอกข้อมูลที่เหลือจากอาร์เรย์ซ้ายและขวา
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

    // ฟังก์ชันหลักสำหรับ Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // เรียงลำดับลิสต์ย่อยซ้ายและขวา
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // รวมลิสต์ย่อยเข้าด้วยกัน
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Given Array: " + Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
