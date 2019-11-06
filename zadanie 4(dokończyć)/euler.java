public class test
{
	static public void main(String[] args)
	{		
			int zadana=400;
			int suma=0;
			int dzielniki=0;
			int i=1;
			
    			while(true)
				{
					suma+=i;
					dzielniki=spr_dzielniki(suma);
					System.out.println("suma "+suma);
					System.out.println("dzielniki "+dzielniki);
					if(dzielniki>zadana)
					{
						System.out.println("Wartosc pierwszego trojkata,ktora ma wiecej niz "+zadana+" dzielnikow to: "+suma);
						break;
					}
					i+=1;
				}
	}
	static public int spr_dzielniki(int suma)
	{
	int dzielniki=0;
	int x=0;
		for(int i=1;i<=suma;i+=1)
		{
			x=suma%i;
			if(x==0)
			{
				dzielniki+=1;
			}
		}
		return dzielniki;
	}
}