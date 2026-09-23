// Same Direction Pointer
// Instead of: L →              ← R

// we'll have:
//        slow →
//        fast →
package Arrays.TwoPointer_Sliding;

public class DiffDirctn_2 {
    public static int RemDup(int[] arr){

        






        return 0;
    }


    public static void main(String[] args) {
    // Question: 1.  Remove Duplicates from Sorted Array
    // Given a sorted array, remove the duplicates in-place.
    // Example: Input  : [1, 1, 2, 2, 3, 3, 4], Output : [1, 2, 3, 4]
    // Your RemDup() function should modify the array and return the number of unique elements.

    int[] arr1 = {1, 1, 2, 2, 3, 3, 4};
    int k1 = RemDup(arr1);
    System.out.println("Number of unique elements: " + k1);
    System.out.print("Array after removing duplicates: ");
    for (int i = 0; i < k1; i++) {
        System.out.print(arr1[i] + " ");
    }
    System.out.println();

    // Test Case 2
    int[] arr2 = {1, 1, 1, 2, 2, 3};
    int k2 = RemDup(arr2);
    System.out.println("Number of unique elements: " + k2);
    System.out.print("Array after removing duplicates: ");
    for (int i = 0; i < k2; i++) {
        System.out.print(arr2[i] + " ");
    }
    System.out.println();

    // Test Case 3
    int[] arr3 = {1, 2, 3, 4, 5};
    int k3 = RemDup(arr3);
    System.out.println("Number of unique elements: " + k3);
    System.out.print("Array after removing duplicates: ");
    for (int i = 0; i < k3; i++) {
        System.out.print(arr3[i] + " ");
    }
    System.out.println();

    }
}
