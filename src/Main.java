import java.util.*;
public class Main {
    public static void main(String[] args){
        int l = 10;
        int [] a = new int[l];
        int somma=0;
        int contatore=0;
        int min=a[0];

        Scanner in = new Scanner(System.in);


        for(int i = 0; i<a.length; i++) {
            System.out.println("inserisci l'elemento alla posizione di indice:" + i);
            a[i] = in.nextInt();
            somma += a[i];
        }

        while (contatore<a.length){
            if(a[contatore]<min){
                min=a[contatore];
            }
            contatore+=1;
        }
        float media = (float)(somma/a.length);
        System.out.println("a= "+ Arrays.toString(a));
        System.out.println(" la somma è "+ somma);
        System.out.println(" la media è "+media);
        System.out.println(" il valore minimo del array è "+min);

    }
}