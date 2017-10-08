import java.util.*;

public class FrequencyWord{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		String arr[]=str.split(" ");
		final TreeMap<String, Integer> tmap=new TreeMap<String, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!tmap.containsKey(arr[i]))
				tmap.put(arr[i],1);
			else
				tmap.put(arr[i],tmap.get(arr[i])+1);
		}
		Comparator <String> comp=new Comparator<String> ()
		{
			public int compare(String a,String b) {
				if(tmap.get(b)==(tmap.get(a)) || tmap.get(b)>(tmap.get(a)))
     					return 1;
				else
						return -1;
			    }
		};
		TreeMap<String, Integer> tmap1=new TreeMap<String, Integer>(comp);
		tmap1.putAll(tmap); 
		for(Map.Entry<String,Integer> entry: tmap1.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

