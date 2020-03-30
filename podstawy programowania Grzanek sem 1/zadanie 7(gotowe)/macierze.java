import java.util.Scanner;
//program pobiera od uzytkownika dane,zapisuje je do macierzy ktore nastepnie mnozy.Wynik zapisany jest w macierzy 'wynik' i wyświetlony na ekranie
public class macierze
{
	public static void main(String[] args)
	{
	
	Scanner skaner=new Scanner(System.in);
    System.out.println("program do mnozenia dwoch macierzy");
	System.out.println("Podaj liczbe wierszy pierwszej macierzy: ");
	int wiersze1=skaner.nextInt();
	System.out.println("Podaj liczbe kolumn pierwszej macierzy: ");
	int kolumny1=skaner.nextInt();
	
	System.out.println("Podaj liczbe wierszy drugiej macierzy: ");
	int wiersze2=skaner.nextInt();
	System.out.println("Podaj liczbe kolumn drugiej macierzy: ");
	int kolumny2=skaner.nextInt();
	
		//sprawdzenie czy macierze mozna ze soba pomnozyc
		if(kolumny1==wiersze2)
		{
			//tworzy macierze o zadanej wielkosci oraz taka ktora zmiesci wynik
			double macierz1[][] = new double[wiersze1][kolumny1];
			double macierz2[][] = new double[wiersze2][kolumny2];
			double wynik[][]    = new double[wiersze1][kolumny2];
			
			//uzypelnienie macierzy wartosciami
			UzupMacierz(wiersze1,wiersze2,kolumny1,kolumny2,macierz1,macierz2,wynik);
			//mnozy macierze
			Macierz_x_Macierz(wiersze1,kolumny1,kolumny2,macierz1,macierz2,wynik);
			//pokazuje wynk
			Show_wynik(wynik,wiersze1,kolumny2);	
		}
	}
	//pokazuje na ekranie wynik
	public static void Show_wynik(double[][] wynik,int wiersze1,int kolumny2)
	{
		for(int i = 0;i < wiersze1; i++)
		{
			for(int j = 0;j < kolumny2; j++)
			{
				System.out.print(wynik[i][j] + " ");
			} 
			System.out.println("");
		}
	}
	//mnozy macierze(na podstawie informacji znalezionych na https://eduinf.waw.pl/inf/alg/001_search/0074.php )
	public static void Macierz_x_Macierz(int wiersze1,int kolumny1,int kolumny2,double[][] macierz1,double[][] macierz2,double[][] wynik)
	{
		double suma = 0;
		
		  for(int i = 0; i < wiersze1; i++)
        {
            for(int j = 0; j < kolumny2; j++)
            {
				suma = 0;
                for(int x = 0; x < kolumny1 ; x++)     
                        {
							suma += macierz1[i][x] * macierz2[x][j];
						}
                wynik[i][j] = suma;
            }
        }
	}
	
	public static void UzupMacierz(int wiersze1,int wiersze2,int kolumny1,int kolumny2,double[][] macierz1,double[][] macierz2,double wnik[][])
	{
		Scanner skaner=new Scanner(System.in);
		System.out.println("Wpisz wartosci pierwszej macierzy oddzielajac je enterem:");
		for(int i=0;i<wiersze1;i++)
		{
			for(int j=0;j<kolumny1;j++)
			{
				 macierz1[i][j]=skaner.nextDouble();
			}
		}
		System.out.println("Wpisz wartosci drugiej macierzy oddzielajac je enterem:");
		for(int i=0;i<wiersze2;i++)
		{
			for(int j=0;j<kolumny2;j++)
			{
				 macierz2[i][j]=skaner.nextDouble();
			}
		}
	}
} 