import java.util.Random;
public class zbp
{
	public static void main(String[] args)
	{
		int range=100;
		int size=5;//ilosc liczb na wejsciu
		int row_count=matrix_size(size);//oblicza ilosc podzbiorow(ilosc wierszy macierzy z wynikiem)
		int[] input=new int[size];
		int[] bin=new int[size];
		int[][] output=new int[row_count][size];
		tab_fill(input,range);
		matrix_fill(input,output,bin,row_count);
		System.out.println("Wejscie: ");
		for(int i=0;i<=size-1;i++)
		{
			System.out.print(input[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Wyjscie: ");
		matrix_show(output,row_count,size);
	}
	
	public static void matrix_show(int[][] output,int row_count,int size)//pokazuje wynik na ekranie
	{
		for(int i=0;i<=row_count-1;i++)
		{
			System.out.print("{");
			for(int j=0;j<=(size-1);j++)
			{
				if(output[i][j]!=0)
				{
					System.out.print(" ");
					System.out.print(output[i][j]);
					System.out.print(" ");
				}
				else
				{
					System.out.print("");
				}
			}
			System.out.print("}");
			System.out.println("");
		}
	}
	public static void bin_adder(int[] bin,int ile)//do tablicy bin dodaje wartosc zawarta w zmiennej 'ile' w systemie binarnym
	{
		for(int j=0;j<=ile;j++)
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
	public static void matrix_fill(int[] input,int[][] output,int[] bin,int row_count)//wypelnia tablice wynikami
	{
		int bin_pointer=bin.length-1;
		bin_adder(bin,1);
		for(int i=1;i<=row_count-1;i++)//iteruje po wierszach
		{
			for(int j=0;j<=input.length-1;j++)//iteruje po kolumnach
			{
				for(int k=bin_pointer;k>=0;k--)//iteruje po tablicy bin
				{
					if(bin[k]==1)
					{
						output[i][j]=input[k];
						bin_pointer=k-1;
						break;
					}
				}
			}
			bin_adder(bin,1);
			bin_pointer=bin.length-1;
		}
	}
	public static void tab_fill(int[] input,int range)//wypenia tablice losowymi liczbami z wybranego przedzialu(bez powtorzen)
	{
		Random gen=new Random();
		boolean repeat=false;
		int x=0;
		if(range<input.length)
		{
			System.out.println("Zmienna 'range' musi byc rowna lub wieksza zmiennej 'size'");
			return;
		}
		for(int i=0;i<=input.length-1;)
		{
			x=(gen.nextInt(range)+1);
			for(int j=0;j<=input.length-1;j++)
			{
				if(input[j]==x)
				{
					repeat=true;
					break;
				}
			}
			if(repeat==false)
			{
				input[i]=x;
				i++;
			}
			repeat=false;
		}
	}
	public static int matrix_size(int n)//sprawdza ile wierszy ma miec macierz z wynikiem
	{
		int x=1;
		for(int i=0;i<=n-1;i++)
		{
			x=x*2;
		}
		//System.out.println(x);
		return x;
	}
}