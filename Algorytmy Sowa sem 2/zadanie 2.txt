
//Piotr Jędrzejczak-Rakowski 99660
//
//Algorytm wstawia liczbe na odpowiednie miejsce w posortowanym wektorze

public class zadanie {
    public static void main(String Args[]) {

        int[] wek = {7,9,12,13,14,17,45,57,89,95,0,0,0,0,0};
        int wstawiana = -500;
        boolean wieksza = false; 				//ustawiane jest na true gdy liczba wstawiana jest wieksza niz najwieksza liczba w wektorze
        int ost_index = 0;					//indeks ostatniej liczby niezerowej w wektorze
        int wstaw_index = 0; 					//indeks na ktory wstawiana bedzie wartosc zmiennej 'wstawiana'

        for (int i = 0; i < wek.length; i++) 			//szukanie ostatniej niezerowej liczby
        {
            if (wek[i] == 0) {
                ost_index = i - 1;
                break;
            }
        }
        for (int j = 0; j <= ost_index; j++) 			//szukanie indeksu w na ktory nalezy wstawic wartosc zmiennej 'wstawiana'
        {
            if (wstawiana > wek[ost_index]) 			//ten if wykonuje sie gdy wstawiana jest wieksza niz najwieksza liczba w tablicy
            {
                wstaw_index = ost_index + 1;
                break;
            }

            if (wek[j] >= wstawiana) 				//ten if wykonuje sie gdy wstawiana jest mniejsza lub rowna najwiekszej liczbie w tablicy
            {
                wstaw_index = j;
                break;
            }
        }
        if (wieksza == false) {
            for (int k = ost_index; k >= wstaw_index; k--) 	//przesuwanie elementow tablicy w prawo tak,aby zrobic miejsce dla wstawianego elementu
            {
                wek[k + 1] = wek[k];
            }
        }
        wek[wstaw_index] = wstawiana; 			//wstawienie wartosci 'wstawiana' na swoje miejsce

        System.out.println("liczba zostala wstawiona na indeks: " + wstaw_index);
        for (int l = 0; l < wek.length; l++) {
            System.out.print(wek[l] + " ");
        }
    } //main
} //klasa