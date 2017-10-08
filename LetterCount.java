import java.util.*;
public class CountLetters{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		int a[]=new int[256];
		for(int i=0;i<256;i++)
			a[i]=0;
		for(int i=0;i<str.length();i++)
		{
			a[str.charAt(i)]++;
		}
		for(int i=0;i<256;i++)
		{
			if(a[i]!=0)
				System.out.println((char)i+" "+a[i]);
		}
	}

}