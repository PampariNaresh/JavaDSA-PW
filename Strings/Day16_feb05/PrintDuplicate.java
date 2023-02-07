import java.util.*;

class PrintDuplicate {
     static void printDuplicate(char arr[],int n) {
        int newindex=0;
        for(int i=0;i<n;i++) {
            int j;
            for(j=0;j<i;j++){
                if(arr[i]==arr[j]) {
                    System.out.print(arr[j]+" ");
                    
                }
            }
            
        }
        System.out.println();
           
    }
    public static void main(String args[]) {
        String s ="physicwallah";
        char arr[] =s.toCharArray();
         printDuplicate(arr,arr.length);
        
    }
}