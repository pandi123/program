package working;

public class malayalam {
	public static void main(String[] args) {
		String s="malayalam";
		char a[]=s.toCharArray();
		char a1[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a1[j])
				{
					
					a1[j]='@';
				}
			}
		}
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a1[i]!='@')
			{
				System.out.print(a1[i]);
				
		}
		
    }

	}
}
