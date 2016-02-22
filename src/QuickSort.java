/**
 * Created by Flo on 22-Feb-16.
 */
public class QuickSort {

    public static void quickSort(String[] awsmArray, int left, int right) {
        int pivot, i, j;
        String aux = new String();

        pivot = (right + left) / 2;
        i = left;
        j = right;
        do {
            while (awsmArray[i].compareTo(awsmArray[pivot]) <= 0 && i < right)
                i++;
            while (awsmArray[j].compareTo(awsmArray[pivot]) >= 0 && j > left)
                j--;
            if (i <= j) {
                aux = awsmArray[i];
                awsmArray[i] = awsmArray[j];
                awsmArray[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        if (left < j)
            QuickSort.quickSort(awsmArray, left, j);
        if (i < right)
            QuickSort.quickSort(awsmArray, i, right);
    }

    public static void main(String[] args){
        String[] awesomeArray = new String[10];
        awesomeArray[0] = "Druta";
        awesomeArray[1] = "Johann";
        awesomeArray[2] = "Zaha";
        awesomeArray[3] = "Mark";
        awesomeArray[4] = "Cota";
        awesomeArray[5] = "Florea";
        awesomeArray[6] = "Pop";
        awesomeArray[7] = "Platon";
        awesomeArray[8] = "Daineanu";
        awesomeArray[9] = "Mark";
        System.out.println("\t\tBefore Sort:");
        for (int i = 0; i < awesomeArray.length; i++) {
            System.out.println(awesomeArray[i]);
        }
        QuickSort.quickSort(awesomeArray, 0, awesomeArray.length - 1);
        System.out.println("\t\tAfter Sort:");
        for (int i = 0; i < awesomeArray.length; i++) {
            System.out.println(awesomeArray[i]);
        }
    }
}
