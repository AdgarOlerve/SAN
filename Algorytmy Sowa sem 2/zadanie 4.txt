//Piotr Jędrzejczak-Rakowski 99660
//
//Szukanie binarne

import java.util.Scanner;
public class zadanie
{
    public static void main(String[] args)
    {
        int[] wektor = new int[100];
        losowanie(wektor); //wypelnia wektor rosnacymi,losowymi liczbami

        for(int i=0;i<wektor.length;i++)//pokazuje zawartosc wektora na ekranie
        {
            System.out.println(wektor[i]);
        }
        Scanner skaner = new Scanner(System.in);
        System.out.println("podaj liczbe z podanego przedzialu ");
        int input=0;
        try
        {
            input = skaner.nextInt(); //przyjecie szukanej liczby od uzytkownika
        }
        catch(Exception e) //sprawdzenie czy to co wpisal uzytkownik jest liczba calkowita
        {
            System.out.println("Nie podales liczby calkowitej,program konczy prace");
        }

        szukanie(wektor,input); //szuka podanej przez uzytkownika zmiennej w wektorze
    }
    public static void szukanie(int[] wektor,int szukana)
    {
        int lewy=0; //indeks poczatku przedzialu
        int prawy=wektor.length-1;//indeks konca przedzialu
        int srodek; //zmienna przechowujaca srodek aktualnie przerabianego przedzialu
        while(lewy<prawy)
        {
            srodek=(lewy+prawy)/2; //obliczanie srodka aktualnie przerabianego przedzialu
            if(wektor[srodek]<szukana) //sprawdzenie czy szukana jest po lewej czy prawej stronie od srodka i odpowiednie "zawezenie" przedzialu poszukiwan
            {
                lewy=srodek+1;
            }
            else
            {
                prawy=srodek;
            }

        }
        if(wektor[lewy]==szukana) //jesli nasz jednoelementowy przedzial jest szukana to zwracany jest odpowiedni komunikat
        {
            System.out.println("szukana liczba znajduje sie na indeksie :"+lewy);
        }
        else //a jesli nie znaleziono szukanej wyswietlany jest ten komunikat
        {
            System.out.println("w wektorze nie ma szukanej liczby");
        }
    }
    public static void losowanie(int[] wektor)
    {
        int buf = 0;

        for (int i = 0; i < wektor.length;i++) //wypenianie wektora losowymi liczbami
        {
            wektor[wektor.length-1] = (int) ((10*Math.random())+1); //uzywam ostatniego miejsca w wektorze jako zmiennej tymczasowej aby nie zapelniac pamieci zbednymi zmiennymi
            buf = buf + wektor[wektor.length-1];//dodaje wylosowana liczbe do zawartosci zmiennej buf aby kazda kolejna wylosowana liczba byla wieksza o losowa wartosc
            wektor[i]=buf;  //przypisuje wartosc zmiennej buf do wektora
        }
    }
}
