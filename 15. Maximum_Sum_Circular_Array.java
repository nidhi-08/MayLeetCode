class Solution {
    public int maxSubarraySumCircular(int[] A) {
        /*
            ALGORITHM:
            1. Find sum of array.
            2. Find MaxSum of array
            3. Find MinSum of array
            4. return MAX(Sum-MinSum || MaxSum)
        
        */
        int acc = 0;
        int arr[] = new int[A.length];
        arr=A;      //created new array arr to avoid changing original array
        int max1 = Kadane(arr);
        for(int i = 0; i < arr.length; i++) {
            acc += arr[i];
            arr[i] = -arr[i];
        }
        int min = Kadane(arr);
        int max2 = acc + min;
        if(max2 == 0) {
            return max1;
        }
        return Math.max(max1, max2);

    }
    
    public int Kadane(int[] arr) {
        int maxSum = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            maxSum = Math.max( (maxSum + arr[i]), arr[i]);
            max = Math.max(max, maxSum);        //inbuilt math function to return max value
        }
        return max;     
    }
}
