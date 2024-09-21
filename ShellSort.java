public class ShellSort {
    private int list[] = null;
    public ShellSort(int list []){
        this.list = list;

    }

    public void shellSort(){
        int  j;
        for (int gap =  list.length / 2; gap > 0 ; gap /= 2) {
            // แบ่งเป็น 2 ก้อนเทียบกันนน
            for (int i = gap; i < list.length; i++) {
                int tmp = list[i];
                for ( j = i; j >= gap && tmp < (list[j - gap] ); j -= gap) {
                    list[j] = list[j - gap];

                    // เทียบแบบไม่ซ้ำกัน
                }
                list[j] = tmp;
               
                
            }
            
        }
    }

    public void showPrint(){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

}
