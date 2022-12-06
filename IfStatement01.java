package day04ifstatement;

public class IfStatement01 {

    public static void main(String[] args) {

        //Sayı pozitif ise ekrana pozitif yazdırın

        int s = 12;

        if (s>0){
            System.out.println("'Positive'");
        }

        //if statement belli kodları belli şartlara bağlı olarak çalıştırmaya yarar.

        //verilen karakter büyük harf ise ekrana "Büyük Harf" yazdırın

        char ch = 'Z';

        if (ch>='A' && ch<='Z'){

            System.out.println("Büyük Harf");

        //"&&" 'and' işlemi. Sadece "boolean" lar ile kullanılır.
        // and işlemleriyle verilen işlerin hepsi de yapılmalıdır. true and true olması lazım

        //ex: verilen bir sayı üç basamaklı ise ekrana Üç Basamaklı yazdırınız
        }

        int sayi = -999;
        sayi = Math.abs(sayi);

        if (sayi>99 && sayi<1000){

            System.out.println("Üç Basamaklı");
        }

        int x =10;  // (= işareti assigment operator.) [mat. eşittir semboli "==" şeklindedir]

        if (x%2==0){   //% mod işaretidir. "macılıs"

            System.out.println("Çift Sayı");
        }

        //ex: verilen bir sayı 300den küçük veya 1200den büyük ise ekrana "Harika Sayı" yazdırın.

        int r = 1250;

        if (r<300 || r>1200) {  //veya işareti "alt gr + çizgi" tuşuyla yapılır. || ==> veya

            System.out.println("Harika Sayı");
        };






    }

}
