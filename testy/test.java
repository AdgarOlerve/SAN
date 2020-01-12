public class test
{
	public static void main(String[] args)
	{
		int[] bin=new int[10];
		for(int i=0;i<=10;i++)
		{
			pokaz(bin);
			bin_adder(bin,1);
			
		}
		pokaz(bin);
	}
	public static void pokaz(int[] bin)
	{
		for(int i=0;i<=bin.length-1;i++)
		{
			System.out.print(bin[i]);
		}
		System.out.println("");
	}
	public static void bin_adder(int[] bin,int ile)
	{
		for(int j=1;j<=ile;j++)
		{
			for(int i=bin.length-1;i>=0;i--)
			{
				if(bin[i]==0)
				{
					bin[i]=1;
					if((i-1>=0)&&(bin[i-1]==0))
					{
						break;
					}
					else if((i-1>=0)&&(bin[i-1]==1))
					{
						break;
					}
				}
				else if(bin[i]==1)
				{
					bin[i]=0;
				}
			}
		}
	}
}