class MaxOccurChar {
    public static void main(String args[]) {
        String str ="Helloworld";
        int count[] =new int[256];
        char maxchar=' ';
        for(int i=0;i<str.length();i++) {
            count[str.charAt(i)]+=1;
        }
        int max =count[0];
        for(int i=0;i<str.length();i++) {
            if(count[str.charAt(i)]>max) {
                max =count[str.charAt(i)];
                maxchar = str.charAt(i);
            }
        }
        System.out.println("Max Occuring Character is "+maxchar+" that is "+max+" times");
    }
}