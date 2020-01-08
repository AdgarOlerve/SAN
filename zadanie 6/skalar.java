//program liczy i zwraca wartość iloczynu skalarnego wektorów w przestrzeni R(n).
import java.util.Random;
public class skalar
{
	public static void main(String[] args)
	{
		int vector_size=10; //wielkosc wektora
		int vector_count=3; //ilosc wektorow
		int range=50;
		int counter=0;
		
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
				
			}
			counter++;
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
			}
		}
	}
}