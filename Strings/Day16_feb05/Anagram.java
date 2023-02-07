
class Anagram{
 int totalcharacters= 256;
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
public boolean checkAnagram(char[] str1,char[] str2)
{
	int[] countarr = new int[totalcharacters];
	int i;
	if (str1.length != str2.length)
		return false;
	for(i = 0; i < str1.length; i++)
	{
		countarr[str1[i]]++;
		countarr[str2[i]]--;
	}
	for(i = 0; i < totalcharacters; i++)
		if (countarr[i] != 0)
		{
			return false;
		}
	return true;
}

static  String splitString(String str) {
    String splitspacestr ="";
    for(int i=0;i<str.length();i++) {
        if(str.charAt(i)!=' ')
            splitspacestr+=str.charAt(i);
    }
    return splitspacestr;

}
static char[] chararray(String str) {
    char[] chararr =new char[str.length()];
    for(int i=0;i<str.length();i++) {
        chararr[i]=str.charAt(i);
    }
    return chararr;

}
public static void main(String[] args)
{   String s1="School Master";
    String s2 ="The Classroom";
    s1 =splitString(s1);
    s2 =splitString(s2);
    s1 =lowerCase(s1);
    s2 =lowerCase(s2);

	char str1[] = chararray(s1);
	char str2[] = chararray(s2);
    Anagram a =new Anagram();
	if (a.checkAnagram(str1, str2))
		System.out.print("Anagram");
	else
		System.out.print("Not Anagram");
}
}

