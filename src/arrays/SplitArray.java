package arrays;

import java.util.*;

class SplitArray {
    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int splitSize = 5;

		/* expected Output
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
		*/
        System.out.println("output");
        List<int[]> list = splitArray(original, splitSize);
        list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
    }

    public static List<int[]> splitArray(int[] array, int splitSize) {
//        List<int[]> output = new ArrayList<>();
//        int[] temp = new int[splitSize];
//        int len = array.length;
//        int j=0;
//        for(int i=0; i<len; i++){
//            temp[j] = array[i];
//            j++;
//            if(j==splitSize){
//                output.add(temp);
//                j=0;
//                temp = new int[splitSize];
//            }
//        }
//        int remaining = len%splitSize;
//        temp = new int[remaining];
//        int k=0;
//        for(j=len-remaining; j<len; j++){
//            temp[k] = array[j];
//            k++;
//        }
//        output.add(temp);
//        return output;
//
//    }

        List<int[]> output = new ArrayList<>();
        int len = array.length;
        int startIndex = 0;

        while (startIndex < len) {
            int subArrayLength = Math.min(splitSize, len - startIndex);
            int[] subArray = new int[subArrayLength];

            for (int i = 0; i < subArrayLength; i++) {
                subArray[i] = array[startIndex + i];
            }

            output.add(subArray);
            startIndex += splitSize;
        }

        return output;
    }
}


