public class SelectionSort {
    private int list[] = null;
    private int min = Integer.MAX_VALUE;

    public SelectionSort(int list[]) {
        this.list = list;
        System.out.println("MAX : " + valueMax());
    }

    public int valueMax() {
        for (int i = 0; i < list.length; i++) {
            if (list[i] > min) {
                min = list[i];

            }
        }
        return min;
    }

    public boolean sortCheck() {
        for (int i = 1; i < list.length; i++) {
            if (list[i] < list[i - 1]) {
                return false;
            }

        }
        return true;

    }

    public void Sort_selection() {
        System.out.println("BEFORE : ");
        showPrint();
        for (int i = 0; i < list.length - 1; i++) {
            min = i;
            
            for (int j = i + 1; j < list.length; j++) {
                if(list[j] < list[min]){
                    min = j;
                }

            }
            if (min != i) {
                int temp = list[i];
                list[i] = list[min];
                list[min] = temp;
            }
        }
        System.out.println();
        System.out.println("AFTER : ");
        showPrint();
    }

    public void showPrint() {
        for (int i = 0; i < list.length; i++) {

            System.out.print(list[i] + " ");
        }
    }

}
