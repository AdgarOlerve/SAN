//Piotr Jędrzejczak-Rakowski 99660
//
//Sortowanie przez proste wybieranie
public class zadanie
{
    public static void main(String[] args)
    {
        int[] wektor = new int[10];
        System.out.println("Przed sortowaniem: ");
        for(int i=0;i<wektor.length;i++) //wypelnianie wektora losowymi liczbami
        {
            wektor[i] = (int) (100*Math.random()+1);
            System.out.print(wektor[i]+", ");
        }
        int buf=0;//zmienna tymczasowo przechowujaca wartosc potrzebna do zamiany miejscami
        for(int j=0;j<wektor.length;j++)
        {
            for(int k = j;k<wektor.length;k++)
            {
                if(wektor[k]<wektor[j])//jezeli wartosc pod indeksem k jest mniejsza od wartosci pod indeksem j to zamienia je miejscami
                {
                    buf=wektor[j];
                    wektor[j]=wektor[k];
                    wektor[k]=buf;
                }
            }
        }
        System.out.println("");
        System.out.println("Po sortowaniu: ");
        for(int l = 0;l<wektor.length;l++)
        {
            System.out.print(wektor[l]+", ");
        }
    }
}
