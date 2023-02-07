import java.util.*;
class palindrome {
    static boolean checkPalindrome(String str) {
        char arr[] =str.toCharArray();
        int start =0;
        int end =arr.length-1;
        while(start<=end) {
            char temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        String newstr =String.valueOf(Arrays.copyOf(arr,arr.length));
        if(str.equals(newstr)) {
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
      String s ="2552";
      if(checkPalindrome(s)) {
        System.out.println("Yes,it is Palindrome!!");
      }else {
        System.out.println("No,it is not Palindrome!!");
      
      }

    }
}