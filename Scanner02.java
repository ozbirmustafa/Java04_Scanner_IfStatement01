package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //kullanıcıdan ilk ve soy ismini alınız. ilk ve soyisminin ilk harflerini ekrana yazdırınız

        Scanner input = new Scanner(System.in);

//        System.out.println("ilk isminizi giriniz");
//        char ilk = input.next().charAt(0); //Kelimelerin ilk harfi 0, ikincis 1 diye devam eder.
//        System.out.println(ilk);
//
//        System.out.println("soyisminizi giriniz");
//        char son = input.next().charAt(0);
//        System.out.println("" + ilk +"-" + son);

        //"+" işareti ya Toplama yA da Birleştirme için kullanılabilir.
        //System.out.println('A' + 'B'); ekrana AB yerine 131 yazdirir
        //parantez içine "" ile bsşlarsak Birleştirme olur. ('A' + 'B') = AB


        //2.Yol:

        System.out.println("tam isminizi giriniz");
        String tamİsim = input.nextLine(); // Ali Can
        char ilkHarf =tamİsim.charAt(0);
        System.out.print("" + ilkHarf);

        char soyİsminİlkHarfi = tamİsim.split(" ")[1].charAt(0);
        System.out.println(soyİsminİlkHarfi);






    }

}
