public class euler
{
	static public void main(String[] args)
	{		
		int primes[]=new int[100];
		generator_prim(primes);
		for(int i=0;i<=primes.length-1;i++)
		{
		System.out.println(primes[i]);
		}
		
	}
	static public void generator_prim(int[] primes) //generuje liczby pierwsze
	{
		int lim=primes.length-1; //limit ilosc generowanych liczb pierwszych
		int x=2;
		boolean found_div=false; //zmienna zawierajaca info czy znaleziono jakis dzielnik
		int temp=0;
		for(int i=0;i<=lim;)
		{
			for(int j=x-1;j>1;j--) //pętla dekrementuje(poki 'j' jest wieksze od 1) generując tym samym kolejne dzielniki.
			{					
				temp=x%j; //sprawdzenie czy 'x' jest pozdzielne przez wygenerowany dzielnik
				if(temp==0) //jesli jest podzelne,to zmienna 'found_div' ustawiana jest na 'true'
				{
					found_div=true;
					break; //oraz przerywa petle,aby zkrocic czas dzialania algorytmu
				}
			}
			if(found_div==false) //jesli nie znaleziono dzielnikow zawierajacych sie pomiedzy 'x-1' a '1'
			{
				primes[i]=x;    //to x przypisywany jest do kolejnego miejsca w tablicy 'primes'"
				i++;
			}
			found_div=false;
			x++;
		}
	}
}