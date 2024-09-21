public class BubbleSort {
    private int list [] = null;
    public BubbleSort(int list []){
        this.list = list;
    }

    public void bubbleSort(){
        System.out.print("BEFORE : ");
        showPrint();
        boolean swapped = true;
        int j = 0;
        int tmp ;
        while(swapped){
            swapped = false;
            j++;
            for (int i = 0; i < list.length - j; i++) {
                if(list[i] > list[i + 1]){
                    tmp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = tmp;
                    swapped = true;
                }
                
            }
        }
        System.out.print("AFTER : ");
        showPrint();
    }

    public void showPrint(){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

}
