package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {

/*

Kullanıcıdan ilk, orta ve soysimini alınız ve aşağıdaki formatta ekrana yazdiriniz

 */
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

//    System.out.println("İlk İsminiz Giriniz");
//
//    String ilkİsim = input.next(); //next() methodu String datası almak için kullanılır.
//
//    System.out.println("Orta İsminizi Giriniz");
//
//    String ortaİsim = input.next();
//
//    System.out.println("Soy İsminizi Giriniz");
//
//    String soyİsim = input.next();
//
//    System.out.println("Kimlik Numaranızı Giriniz");
//
//    String kimlikNumarası = input.next();
//
//    System.out.println(ilkİsim +" " + ortaİsim + " " + soyİsim);
//    System.out.println(kimlikNumarası);

    //2.Yol:

//    System.out.println("ilk, orta ,soy isminiz ve kimlik no giriniz");
//    String ilk =input.next();
//    String orta =input.next();
//    String soyİsim =input.next();
//    String kimlikNumarası =input.next();
//
//    System.out.println(ilk +" " + orta + " " + soyİsim);
//    System.out.println(kimlikNumarası);

    //3.yol

    System.out.println("ilk, orta, soy isminizi giriniz");
    String tamİSim = input.nextLine();
    System.out.println(tamİSim);
    System.out.println("kimlik numaranızı giriniz");
    String kimlikNo = input.next();
    System.out.println(kimlikNo);


}

}



