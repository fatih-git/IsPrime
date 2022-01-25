import java.util.Scanner;

public class AsalMı {

    public static void main(String[] args) {

        long i=2;
        long deger;

        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen bir değer giriniz: ");
        deger=input.nextLong();

        if(deger==1)
            System.out.println("Asal değildir.");
        else if(deger==2)
            System.out.println("Asaldır.");
        else
            Prime(i,deger);

    }

    public static short Prime(long j, long a){

        short mantik=0;

        if(j>1+a/2){

            System.out.println("Asaldır.");
            return mantik;

        }
        else if (a%j==0){

            mantik=1;
            System.out.println("Asal Değildir.");
            return mantik;

        }

        return Prime(j+1, a);
    }

}