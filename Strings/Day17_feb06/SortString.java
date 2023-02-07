import java.util.*;
class SortString {
    public static String covertString(char charArray[]) {
        String str ="";
        for(int i=0;i<charArray.length;i++) {
            str+=charArray[i];
        }
        return str;

    }
    public static void  main(String args[]) {
        String str ="pwskills";
        char charArray[] =str.toCharArray();
        for(int i=0;i<charArray.length;i++) {
            for(int j =i+1;j<charArray.length;j++) {
                if(charArray[i]>charArray[j]) {
                    char temp =charArray[i];
                    charArray[i] =charArray[j];
                    charArray[j]=temp;
                }
            }
        }
        str =covertString(charArray);
        System.out.println(str);
    }
}