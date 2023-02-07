class ReverseSentence {

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();

    }

    
    public static void main(String args[]) {
    String sentence ="Think Twice";
    String finalsentence ="";
    String words[] =sentence.toLowerCase().split(" ");
    for(int i=0;i<words.length;i++) {
        String s =words[i];
        finalsentence =finalsentence+ reverseString(s)+" ";
    }

    System.out.println(finalsentence);
    }
}