class Count {

    public static void main(String args[]) {
        int vowelcount=0;
        int constcount =0;
        int specialcount =0;
        String str ="Helo23@#";
        str =str.toLowerCase();
        
       for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);
      
            if ( ch >= 'a' && ch <= 'z') {
      
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u')
                    vowelcount++;
                else
                    constcount++;
            }
            else if (ch >= '0' && ch <= '9'){

            }
            else
                specialcount++;
        }
          
        System.out.println("Vowel Count:"+vowelcount);
        System.out.println("Constant Count:"+constcount);
        System.out.println("Special Character Count:"+specialcount);


    }
}