import java.util.Scanner;
public class WordCounter{
	
	public static int wordcount(String s)
	{
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ') && (s.charAt(i)!=',') && (s.charAt(i)!='.'))
			{
				count++;
			}
		}
		return count;
	}
	
	
	public static String Reverseword(String s)
	{
		String[] s1=s.split(" ",-1);
		String s2="";
		for(int i=0;i<s1.length;i++)
		{
			String word=s1[i];
			String rev="";
			int j;
			for(j=word.length()-1;j>=0;j--)
			{
				rev=rev+word.charAt(j);
			}
			
			s2=s2+rev+" ";
		}
		return s2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s=new String();
      System.out.println( "enter a String");
	  Scanner sc=new Scanner(System.in);
	  s=sc.nextLine();
      System.out.println("Words present in given string : "+wordcount(s));
     System.out.println("String After reverse : "+ Reverseword(s));
	}

}