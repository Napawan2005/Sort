public class HeapSort {

    // ฟังก์ชัน heapify ที่ใช้จัด sub-tree ให้เป็น Max-Heap
    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // กำหนด root เป็นค่าสูงสุด
        int left = 2 * i + 1; // ลูกซ้าย
        int right = 2 * i + 2; // ลูกขวา

        // ถ้าลูกซ้ายมีค่ามากกว่า root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // ถ้าลูกขวามีค่ามากกว่า root
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // ถ้าค่า largest ไม่ใช่ root ให้สลับตำแหน่ง
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // เรียก heapify กับ sub-tree ที่ได้รับผลกระทบ
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        // สร้าง Max-Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // แสดงผล Max-Heap ที่สร้างขึ้น
        System.out.println("Max-Heap: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

