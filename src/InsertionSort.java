public class InsertionSort {
    int key;

    private int[] insertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            key = arr[i];
            int j = i;

            while(j > 0 && arr[j - 1] > key) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = key;
        }

        return arr;
    }

    public void printArr(int arr[]) {
        int[] tempArr = insertionSort(arr);

        for(int i = 0; i <tempArr.length; i++){
            System.out.print(tempArr[i] + " ");
        }
        
    }
    

    
}
