import java.util.*;
class Removeduplicate {
  static String removeduplicate(char arr[],int n) {
        int newindex=0;
        for(int i=0;i<n;i++) {
            int j;
            for(j=0;j<i;j++){
                if(arr[i]==arr[j]) {
                    break;
                }
            }
            if(i==j) {
                arr[newindex]=arr[i];
                newindex++;
            }
        }
             return String.valueOf(Arrays.copyOf(arr, newindex));
    }
    public static void main(String args[]) {
        String s ="physicwallah";
        char arr[] =s.toCharArray();
         s=removeduplicate(arr,arr.length);
        System.out.print(s);
        
    }
}