public class QuickSort {

    private int partition (int arr[], int start, int end)  
    {  

        int pivot = arr[end];
        int counter = start - 1;  
    
        for (int i = start; i <= end - 1; i++)  
        {  
            if (arr[i] < pivot)  
            {  
                counter++;
                int t = arr[counter];  
                arr[counter] = arr[i];  
                arr[i] = t;  
            }  
        }  

        int t = arr[counter+1];  
        arr[counter+1] = arr[end];  
        arr[end] = t;  
        return (counter + 1);  

    }  
  
    public void quickSort(int arr[]){  
        int start = 0;
        int end = arr.length - 1;


        if (start < end)  
        {  
            int p = partition(arr, start, end);
            quickSort(arr, start, p - 1);  
            quickSort(arr, p + 1, end);  
        }  
    }

    private void quickSort(int arr[], int start, int end){  

        if (start < end)  
        {  
            int p = partition(arr, start, end);
            quickSort(arr, start, p - 1);  
            quickSort(arr, p + 1, end);  
        }

    }
   
    public void printArr(int arr[]) {
        quickSort(arr);
        for (int i = 0; i < arr.length; i++)  
            System.out.print(arr[i] + " ");  
        }  
    }
