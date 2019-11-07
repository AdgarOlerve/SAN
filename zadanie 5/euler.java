public class euler
{
	static public void main(String[] args)
	{
		int steps=0;
		int buf=0;
		long x=0;
		long max_x=0;
		for(long i=1;i<1000000;)
		{
			x=i;
			System.out.println("Aktualnie sprawdzana liczba: "+x);
			while(x!=1)
			{
				if(x%2==0)
				{
					x=x/2;
					buf++;
				}
				else if(x%2!=0)
				{
					x=(3*x)+1;
					buf++;
				}
				//System.out.println("po zmianie "+x);
			}
			if (buf>steps)
			{
				steps=buf;
				max_x=i;
			}
			buf=0;
			i++;
		}
		System.out.println("Najwieksza liczbe krokow do uzyskania 1 posiada liczba: "+max_x+" liczba krokow: "+steps);
	}
}