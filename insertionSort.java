/**
 * insertionSort
 * 29 10 14 37 13
 */
public class insertionSort {
    private int list[] = null;
    public insertionSort(int list[]) {
        this.list = list;
    }

    public void Sort(){
        for (int i = 1; i < list.length; i++) {
            System.out.print("MY LIST: ");
            showPrint();
            System.out.println();
            int copy = list[i];
            System.out.println("COPY : "+copy);
            for (int j = i; j > 0 && list[j - 1] > copy; j--) {
                
                list[j] = list[j - 1];
                list[j - 1] = copy;
                System.out.println("IN CONDITION : J( "+j+" ) " + list[j] + " && J-1( "+list[j-1]+" )");
                
            }
            System.out.print("==========\n    UPDATE : ");
            showPrint();
            System.out.println();
            System.out.println("==========");
            
            
        }
    }

    public void showPrint(){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }



}