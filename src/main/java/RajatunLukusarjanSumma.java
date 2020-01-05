
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("First:");
        int ensimmainen = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Last:");
        int viimeinen = Integer.valueOf(lukija.nextLine());
        
        int luku = ensimmainen;
        int summa = 0;
      
        while (luku  <= viimeinen) {
            summa += luku; 
            luku++;        
        }  
        System.out.println(summa);
    }
}