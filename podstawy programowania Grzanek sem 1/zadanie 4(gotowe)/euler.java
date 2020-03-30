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
		if(wynik>lim) //jesli wynik(ilosc dzelnikow danej liczby)jest wiekszy niz 'lim' zostaje wyswietlny komunikat a program se zakancza
		{
			System.out.println("");
			System.out.println("trojkat "+triangle);
			System.out.println("dzielnikow "+wynik);
			done=true;
		}
		}
		
	}
	static public int defractiors_counter(int[] tab)//liczy ilosc dzielnikow
	{
		int wynik=1;
		for(int i=0;i<=tab.length-1;i++)
		{
			if(tab[i]>0) 
			{
				tab[i]++; //zwieksza kazdy czynnik inny niz zero o jeden
				wynik=wynik*tab[i]; //mnozy ze soba wszystkie czynniki inne niz zero
			}
			
		}
		return wynik;
	}
	static public void prime_decomposer(int x,int[] primes,int[] tab)//rozklada liczbe na czynniki pierwsze
	{
		int counter=0;
		while(x>1)
		{
			int y=x%primes[counter]; //sprawdza czy 'x' jest podzelny przez dana liczbe pierwsza
			if(y==0) //jesli tak to go dzieli i zwieksza warosc liczacej ilosc wystapien danego czynnika o jeden
			{
				x=x/primes[counter];
				tab[counter]++;
				
			}
			else
			{
				counter++; //jesli nie jest podzielny to zwieksza licznik
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
/*
1.Zrobic tablice wypelniona liczbami pierwszymi
2.wygenerowac liczbe trojkatna
3.rozlozyc ja na czynniki pierwsze przy pomocy liczb z tablicy liczac przy tym ilosc wystepowan kazdego czynnika(zapisac to do innej tablicy)
4.do kazdej wartosci niezerowej z tabliczy czynnikow dodac jeden i pomnozyc je przez siebie
5.wynik tego mnozenia to ilosc dzielnikow danej liczby,jesli jest wiekszy niz 500 to zakonczyc program
*/