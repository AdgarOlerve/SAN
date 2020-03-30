//program liczy i zwraca wartość iloczynu skalarnego wektorów w przestrzeni R(n).
//wypelnia macierz losowymi liczbami z zadanego przedzialu a nastepnie mnozy przez siebie kolejne rzedy
//wynik zapisujac w wektorze 'result'
import java.util.Random;
class euler
{
	public static void main(String[] args)
	{
		int vector_size=10; //wielkosc wektora
		int vector_count=3; //ilosc wektorow
		int range=10;
		int counter=1;
		
		int[][] vector=new int[vector_count][vector_size];
		generator(vector_size,vector_count,range,vector);
		
		//wypelnia wektor 'result' wartosciami z pierwszego wektora macierzy 'vector'
		int[] result=new int[vector_size];
	    for(int i=0;i<vector_size;i++)
	    {
	        result[i]=vector[0][i];
	    }
		
		//liczy iloczyn
		while(counter<vector_count)
		{
			for(int i=0;i<vector_size;i++)
			{
				result[i]=result[i]*vector[counter][i];
			}
			counter++;
		}
		for(int i=0;i<vector_size;i++)
		{
			System.out.println(result[i]);
		}
	}

	//wypelnia macierz liczbami pseudolosowymi z danego przedzialu(zmienna 'range')
	public static void generator(int size,int count,int range,int[][] vector)
	{
		Random gen=new Random();
		for(int i=0;i<count;i++)
		{
			for(int j=0;j<size;j++)
			{
				vector[i][j]=((gen.nextInt(range)+1));
				//System.out.println("randomizer "+i+" "+vector[i][j]);
			}
		}
	}
}