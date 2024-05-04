import java.util.Scanner;

class MissingNumber{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N=in.nextInt();
        System.out.println("Enter the array elements");
        int[] arr=new int[N];
        
        for(int i=0;i<N;i++){
            arr[i]=in.nextInt();
        }
        int n = N+1;
        // Calculate the sum of integers from 1 to n
        
        int sumOfIntegers = (n * (n + 1)) / 2;

        // Calculate the sum of array elements
        int sumOfArray = 0;
        for (int num : arr) {
            sumOfArray += num;
        }

        // The missing number is the difference between the sum of integers and the sum of the array
        int missingNumber = sumOfIntegers - sumOfArray;
        
        System.out.println("The misssing number is: "+missingNumber);
        
    }
}