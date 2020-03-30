
public class euler
{
	public static void main(String args[])
	{
		int a=3,b=4,c=5,suma=1000;
		boolean is_pit=false;
		boolean is_suma=false;
		for(int i=3;i<=suma;i++)//iteruje a
		{
			for(int j=i+1;j<=suma;j++)//iteruje b
			{
				for(int k=j+1;k<=suma;k++)//iteruje c
				{
					is_suma=false;//jesli obie te zmienne beda prawdziwe jednoczesnie
					is_pit=false;	 //oznacza to,ze znaleziono szukana trojke pitagorejska
					a=i;
					b=j;
					c=k;
					if(c%20==0)
					{
					System.out.println("a "+a+" "+"b "+b+" "+"c "+c);
					}
					is_suma=check_sum(a,b,c,suma); //sprawdza czy suma a+b+c=1000
					is_pit=check_pit(a,b,c);		  //sprawdza czy trojka jest pitagorejska
					if((is_suma==true) && (is_pit==true)) //sprawdzenie,czy oba warunki sa prawdziwe jednoczesnie
					{
						break;
					}
				}
				if((is_suma==true) && (is_pit==true))//sprawdzenie,czy oba warunki sa prawdziwe jednoczesnie
					{
						break;
					}
			}
			if((is_suma==true) && (is_pit==true))//sprawdzenie,czy oba warunki sa prawdziwe jednoczesnie
					{
						break;
					}
		}
		System.out.println("a "+a+" "+"b "+b+" "+"c "+c);
		System.out.println("a + b + c = "+(a+b+c));
		System.out.println("a^2 + b^2 = "+((a*a)+(b*b))+" c^2 = "+(c*c));
	}
	public static boolean check_sum(int a,int b,int c,int suma) //sprawdza czy suma a+b+c to 1000
	{
		if(a+b+c==suma)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean check_pit(int a,int b,int c)//sprawdza,czy dane wartosci tworza trojke pitagorejska
	{
		if((a*a)+(b*b)==(c*c))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}