import java.util.Scanner;

public class Calcolatrice
{
    /**
     * @param args
     */
    public static void main (String[] args)
        {

        try (//creo lo scanner
        Scanner input = new Scanner(System.in)) {
            //dichiaro le variabili e le inizializzo se necessario
            float somma, media, x;
            int i,c=1;

            //messaggio di benvenuto
            System.out.println("*Calcolatore Media - Coded by Shin Darth* n");

            //richiedo all'utente l'immissione di un numero intero e lo assegno alla variabile "i"
   System.out.println("Inserisci il numero totale di elementi di cui vuoi calcolare la media:");
            i=input.nextInt();

            //il numero totale dei numeri a cui calcolare la media dev'essere maggiore di 0
            if (i>0)
            {

                //richiedo all'utente l'immissione del primo valore e lo assegno temporaneamente alle variabili somma e media
                System.out.println("Inserisci i valori di cui vuoi calcolare la media");
                System.out.print("Prima cifra: ");
                somma=input.nextFloat();
                media=somma;

                //se il numero degli elementi di cui calcolare la media è superiore ad 1 eseguo i calcoli ripetutamente fino ad ottenere il risultato desiderato
                while (c<i)
                {

                    //richiedo all'utente l'immissione di una nuova cifra e la assegno temporaneamente ad x
                    System.out.print("Nuova cifra: ");
                    x=input.nextFloat();

                    //aggiungo la nuova cifra alla somma totale dei numeri
                    somma+=x;

                    //incremento la variabile contatore
                    c++;

                    //calcolo nuovamente la media
                    media=somma/c;

                    //a meno che non sia l'ultimo ciclo comunico l'attuale risultato
                    if (c!=i)
                    {
                        System.out.println("La media dei primi "+c+" numeri inseriti vale: "+media+"n");
                    }

                }

                //comunico il risultato finale
                System.out.println("La media aritmentica dei precedenti "+c+" numeri inseriti vale: "+media);
            }

            //caso in cui l'utente tenta di calcolare la media di un numero di elementi inferiore ad 1
            else
            {
                System.out.println("Numero di elementi non valido.");
            }
        }

        //fine
    }
}