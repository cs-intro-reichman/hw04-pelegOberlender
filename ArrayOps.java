public class ArrayOps {
    public static void main(String[] args) {
        System.out.println(findMissingInt(new int[] {3, 0, 1}));
        System.out.println(secondMaxValue(new int[] {1,2,3,4,5,8,8}));
        System.out.println(containsTheSameElements(new int[] {2, 2, 3, 7, 8, 3, 2}, new int[] {8, 2, 7, 7, 3}));
        System.out.println(isSorted(new int[] {3, 2, 1}));

        
    }
    
    public static int findMissingInt(int [] array) {
        int missingInt = 0; 
        for(int i = 0 ; i <= array.length ; i++) {
            boolean found = false;
            for(int j = 0; j < array.length; j++) {
                if(array[j] == i) {
                 found = true;
                 break; 
                }         
            }
            if (!found) {
                 missingInt = i;
                 break;
            }
         }
         return missingInt;
    }
    public static int secondMaxValue(int [] array) {
            int firstMax = array[0];
            for(int i = 1; i < array.length; i++) {
                if(array[i] > firstMax) {
                    firstMax = array[i];
                } 

            }
            int count = 0;
            int secondMax = 0;
            for(int i = 1; i < array.length; i++) {
                if(array [i] == firstMax) {
                    count++;
                }
                if (count > 1) {
                    secondMax = array[i];
                }
                if (array[i] < firstMax && array[i] > secondMax) {
                    secondMax = array[i];
                }
            }
            return secondMax;
    } 

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean found = false;
        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]) {
                found = true;
                }      
            }
        if(found == false) {
            return found;
        }
        found = false; 
        }
    return true; 
    }

    public static boolean isSorted(int [] array) {
        boolean isBigger = false;
        boolean isSmaller = false;
        for(int i = 1; i < array.length; i++) {
            if(array[i] >= array[i - 1]) {
                isBigger = true; 
            } else if (array[i] <= array[i - 1]) {
                isSmaller = true;
            }
             else {
                return false; 
            }

            isBigger = false;
            isSmaller = false;
        }
        return true;
    }

}
