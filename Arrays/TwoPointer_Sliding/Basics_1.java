// TWO POINTER VARIATIONS : 
// 1. Opposite Direction
// 2. Same Direction
// 3. Two Pointers + Sorting
// 4. Fast/Slow Pointer in LL

// IN THIS JUST FIRST ONE 
class Basics_1 {
    
public static boolean pairSum(int[] arr,int x){
    int n= arr.length;
    int left = 0;
    int right = n-1;
    int sum = 0;
    while( left < right){
        if( arr[left]+arr[right] == x){
            return true;
        }

        else if(arr[left] +arr[right] > x){
            right--;
        }
        else{
            left++;
        }
        
    }
    return false;
}


public static boolean isPalindrome(String s){
int n = s.length();
int left = 0;
int right = n-1;
while(left < right){
    if(s.charAt(left) != s.charAt(right)){
return false;
    }
    left++;
    right--;
}
    return true;
}

public static boolean invCharPalin(String s){
int n = s.length();
int left = 0;
int right = n-1;

while(left < right){
    if(!Character.isLetterOrDigit(s.charAt(left))){
        left++;
        continue;
    }
        if(!Character.isLetterOrDigit(s.charAt(right))){
        right--;
        continue;
    }

    if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
        return false;
    }
    left++;
    right--;
}
    return true;
}



    public static void main(String[] args) {
//Questin : 1 : Given a sorted array and a target, determine whether two elements have the target sum.
            // Input:
            // arr = [1, 2, 3, 4, 6]
            // target = 6

            // Output:
            // true  ( reason 2 + 4 = 6)
        int[] arr={1,2,3,4,5,6,7,8};
        System.out.println(" Pair found : ");
        System.out.println(pairSum(arr,6));
        System.out.println(pairSum(arr, 10));
        System.out.println(pairSum(arr, 20));
        System.out.println("");

 // Question 2 : VALID PALINDROME : A palindrome is something that reads the same forward and backward. 
//         "madam"   → true
//         "racecar" → true
//         "hello"   → false
        System.out.println("Palindrome or not : ");
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("abba"));

//Question 3 : LC 125 Palindrome IN SENTENCE
    System.out.println();
    System.out.println("FOR SENTENCES");
    System.out.println(
    invCharPalin("A man, a plan, a canal: Panama")
    );

    System.out.println(
        invCharPalin("race a car")
    );

    System.out.println(
        invCharPalin(" ")
    );

    System.out.println(
        invCharPalin("Mad,am")
    );

        System.out.println(
        invCharPalin("MitALIKA_____KHOSLA")
    );
    }
}
