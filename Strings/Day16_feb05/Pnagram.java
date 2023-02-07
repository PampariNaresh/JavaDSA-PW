class Pnagram{
 
static String lowerCase(String str) {

      char[] ch = str.toCharArray();
      for(int a = 0; a < ch.length; a++)
      {
         if(ch[a] >= 'A' && ch[a] <= 'Z')
         {
            ch[a] = (char)((int)ch[a] + 32);
         }
      }
      String lowercase ="";
      for(int i=0;i<ch.length;i++) {
        lowercase=lowercase+ch[i];
      }
      return lowercase;
}

static  String removeSpace(String str) {
    String removespacestr ="";
    for(int i=0;i<str.length();i++) {
        if(str.charAt(i)!=' ')
            removespacestr+=str.charAt(i);
    }
    return removespacestr;

}
static char[] chararray(String str) {
    char[] chararr =new char[str.length()];
    for(int i=0;i<str.length();i++) {
        chararr[i]=str.charAt(i);
    }
    return chararr;

}
 public static boolean checkPnagram(char[] str) {
    int alphacount[] =new int[26];
    for(int i=0;i<str.length;i++) {
        // int ch =str[i]-97;
        alphacount[str[i]-97]+=1;
    }
    for(int i=0;i<alphacount.length;i++) {
        if(alphacount[i]==0) {
            return false;
        }
    }
    return true;
 }
public static void main(String[] args)
{   String s1= "The quick brown fox jumps over the lazy dog";
    
    s1=removeSpace(s1);
    s1=lowerCase(s1);
 

    char str[] =chararray(s1);
   
	if (checkPnagram(str))
		System.out.print("It is a Pnagram");
	else
		System.out.print("It is not a Pnagram");
}
}

