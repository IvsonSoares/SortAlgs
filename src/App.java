public class App {
    public static void main(String[] args) throws Exception {
        int lista[]  = { 13, 18, 27, 2, 19, 25 };
        int lista2[] = { 13, 18, 27, 2, 19, 25 };
        int lista3[] = { 13, 18, 27, 2, 19, 25 };


        QuickSort q = new QuickSort();
        System.out.print("QuickSort:     ");
        q.printArr(lista);
        System.out.println();
        
        BubbleSort b = new BubbleSort();
        System.out.print("BubbleSort:    ");
        b.printArr(lista2);
        System.out.println();
        
        InsertionSort i = new InsertionSort();
        System.out.print("InsertionSort: ");
        i.printArr(lista3);
        System.out.println();

    }
}
