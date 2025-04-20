public class BubbleSort2 {
    
    static void bubbleSort(int arr[]){
        int i, j, temp;
        int n = arr.length;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            
            if (swapped == false)
                break;
        }
    }

    
    static void printArray(int arr[]){
        int n = arr.length;
        int i;
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]){
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        
        BubbleSort2 b=new BubbleSort2();
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}

