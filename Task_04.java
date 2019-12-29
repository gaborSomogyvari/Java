class Task_04{
    public static int finalIndex;
    public static void main(String[] args){
        
        /*TASK DESCRIPTION
        Write a program which denes two arrays of ints and prints all elements that occur
        in both arrays but each value once only, without repetitions.
        For example for arrays
                int[] arr = { 2,3,4,3,6,7,6,8,2,9 };
                int[] brr = { 2,3,6,8,5,1 };
        the result could be (the order of printed values is irrelevant):
                3 6 8 2
        Do not create any auxiliary arrays, collections or Strings. Do not use any classes from
        packages other than the standard java.lang. Do not modify the arrays (in particular,
        do not sort them).
        */


        /*int[] arr = { 2,3,4,3,6,7,6,8,2,9 };
        int[] brr = { 2,3,6,8,5,1 };*/
        int[] arr = { 2, 3, 3, 2 };
        int[] brr = { 3, 2, 2, 3 };
        
        //TESTS
        //int[] arr = { 2,3,4,3,6,7,6,8,2,9,24 };
        //int[] brr = { 2,3,6,8,5,1,78,56,24 };

        //int[] arr = { 1,2,3,4,5,6,7,8,9,9,9,8 };
        //int[] brr = { 1,2,3,4,5,6,7,8,9,9,9,8, 24,23,1,1 };

        
        printArray(findDuplication(findRepeated(arr, brr)));
 

    }
    public static int[] findRepeated(int[] a, int[] b){
        //we iterate through both arrays and find if a value exists in both arrays

        int[] returnArray =new int[Math.max(a.length, b.length)];
        int index=0;
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    returnArray[index]=a[i];
                    index++;
                    break;
                }
            }
        }

        return returnArray;
    }
    public static int[] findDuplication(int[] a){
        //we return a duplication free array

        int[] returnArray =new int[a.length];
        Boolean donotcopy=false;
        int index=0;

        for(int i=0;i<a.length-1;i++){
            for(int j=a.length-1;j>i;j--){
                if(a[i]==a[j]){
                    donotcopy=true;
                }
            }
            if(donotcopy==false){
                returnArray[index]=a[i];
                index++;
            }
            donotcopy=false;
        }
        finalIndex=index;
        return returnArray;
    }
    public static void printArray(int[] a){
        //print the array we made
        for(int i=0;i<finalIndex;i++){
            print(String.valueOf(a[i]));
            
        }
    }
    public static void print(String message){
        System.out.println(message);
    }
}