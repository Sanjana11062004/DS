import java.util.Scanner;

public class RemoveDup {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Base case: empty array
        
        int i = 0; // Pointer i
        for (int j = 1; j < nums.length; j++) { // Pointer j starts from index 1
            if (nums[j] != nums[i]) { // If element at j is different from element at i
                i++; // Move i to the next position
                nums[i] = nums[j]; // Update element at i with element at j
            }
        }
        // i + 1 represents the length of the new array without duplicates
        return i + 1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N=in.nextInt();
        System.out.println("Enter the array elements");
        int[] arr=new int[N];
        
        for(int i=0;i<N;i++){
            arr[i]=in.nextInt();
        }
        int len=removeDuplicates(arr);
        System.out.println("New Length: "+len);
    }
}
