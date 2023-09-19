import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int sayi1, sayi2;

        Scanner inp = new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayı: ");
        sayi1 = inp.nextInt();
        System.out.print("Üs Olacak Sayı:  ");
        sayi2 = inp.nextInt();

        int sayi3 = 1;
        int toplam =1;



                for (sayi3 =1; sayi3 <= sayi2; sayi3++ ) {
                    toplam *= sayi1;

                }
        System.out.println("Toplam : " + toplam);








    }
}
