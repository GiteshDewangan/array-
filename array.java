class RecursiveSum {  
    public static int sumArray(int[] array, int n) {  
        if (n <= 0) {  
            return 0;  
        }  
        return array[n - 1] + sumArray(array, n - 1);  
    }  

    public static void main(String[] args) {  
        int[] array = {1, 2, 3, 4, 5};  
        int result = sumArray(array, array.length);  
        System.out.println("Sum of array elements: " + result);  
    }  
}
