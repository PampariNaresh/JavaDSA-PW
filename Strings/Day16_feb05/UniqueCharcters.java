class UniqueCharcters {
    public static void main(String args[]) {
        String s ="helowrd";
        boolean flag =true;
        for(int i=0;i<s.length();i++) {
            for(int j=i+1;j<s.length();j++) {
                if(s.charAt(i)==s.charAt(j)) {
                    flag =false;
                }
            }
        }
        if(flag==true) {
            System.out.println("Yes String has Unique Characters!");
        }else {
            System.out.println("No String has no Unique Charcters!");
        }
    }
}