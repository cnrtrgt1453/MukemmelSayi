import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Kendileri hariç tüm pozitif bölenlerinin toplamı birbirine
         * eşit olan sayılara arkadaş sayılar denir.*/

        Scanner input = new Scanner(System.in);

        System.out.println("1.sayıyı giriniz..");
        int sayi1 = input.nextInt();


        System.out.println("2. sayıyı giriniz..");
        int sayi2 = input.nextInt();


        int total1 = 0;

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                total1 = total1 + i;
            }
        }


        int total2 = 0;
        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                total2 = total2 + i;
            }
        }

        if (total1 == total2) {
            System.out.println("Tebrikler girmiş olduğunuz sayılar arkadaş sayılardır..");
        } else {
            System.out.println("Üzgünüz, girmiş olduğunuz sayılar arkadaş sayı değillerdir..:(");
        }


    }
}
