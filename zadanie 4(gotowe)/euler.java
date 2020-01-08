public class euler
{
	static public void main(String[] args)
	{	
		int lim=500;
		int size=1476;
		boolean done=false;
		int tab[]=new int[size];//przechowuje ilosc wystepowan kolejnych czynnikow pierwszych w danej liczbie trojkatnej
		int primes[]=new int[size];
		generator_prim(primes);//generuje liczby pierwsze
		int counter=1;
		int wynik=0;
		while(done!=true)
		{
		int triangle=generator_triangle(counter);//generuje kolejne,wzgledem zmiennej 'counter',liczby trojkatne
		counter++;
		prime_decomposer(triangle,primes,tab); //rozklada liczbe na czynniki pierwsze i zlicza ilosc wystepowan danego czynnika
		wynik=defractiors_counter(tab);//liczy ilosc dzielnikow danej liczby
		table_clear(tab);
		if(wynik>lim)
		{
			System.out.println("");
			System.out.println("trojkat "+triangle);
			System.out.println("dzielnikow "+wynik);
			done=true;
		}
		}
		
	}
	static public int defractiors_counter(int[] tab)
	{
		int wynik=1;
		for(int i=0;i<=tab.length-1;i++)
		{
			if(tab[i]>0) //zwieksza wartosc kazdego niezerowego czynnika o jeden
			{
				tab[i]++;
				wynik=wynik*tab[i];
			}
			
		}
		return wynik;
	}
	static public void prime_decomposer(int x,int[] primes,int[] tab)//rozklada liczbe na czynniki pierwsze
	{
		int counter=0;
		while(x>1)
		{
			int y=x%primes[counter];
			if(y==0)
			{
				x=x/primes[counter];
				tab[counter]++;
				
			}
			else
			{
				counter++;
			}
		}
	}
	static public void table_clear(int[] x)//wypelnia tablice zerami
	{
		for(int i=0;i<x.length;i++)
		{
			x[i]=0;
		}
	}
	static public int generator_triangle(int counter)//generuje liczby trojkatne na podstawie zmiennej 'counter'
	{
		int i=1;
		int x=0;
		while(counter!=0)
		{
			x+=i;
			i++;
			counter--;
		}
	
		System.out.println("trk "+x);
		return x;
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