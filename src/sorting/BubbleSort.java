package sorting;

public class BubbleSort {

    public static int[] bubbleSort(int[] array){
        for(int i=array.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
        return array;
    }

    public static void swap(int[] array, int i, int j){
        if(i==j) return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args){
        int[] intArray = {20, 5, 10, -7, 67, 1, 45};
         bubbleSort(intArray);
        for (int i : intArray) {
            System.out.println(i);
        }
    }

}
