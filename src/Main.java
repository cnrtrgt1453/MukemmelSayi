import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Kendisinin dışında tüm pozitif bölenlerinin
         sayısının toplamı kendine eşit olan sayıya mükemmel sayı denir.
        Örneğin: 6=1+2+3, 28 */

        Scanner input=new Scanner(System.in);
        System.out.println("Sayi giriniz..");
        int sayi=input.nextInt();
        int total=0;
        for (int i=1;i<sayi;i++)
        {
            if (sayi%i==0){
                total=total+i;
            }
        }
        if (total==sayi)
        {
            System.out.println("MÜKEMMEL !!! ");
        }else
        {
            System.out.println("Mükemmel Değil..");
        }
    }
}
