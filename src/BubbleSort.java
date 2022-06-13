public class BubbleSort {

    private int[] bubbleSort(int arr[]){
        int temp;
        for (int i = arr.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }  
    public void printArr(int arr[]) {
        int[] tempArr = bubbleSort(arr);

        for(int i = 0; i <tempArr.length; i++){
            System.out.print(tempArr[i] + " ");
        }
        
    }
}
