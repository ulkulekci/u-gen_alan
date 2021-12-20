import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      int a, b, c, u, cevre;
      Scanner kenar=new Scanner(System.in);
        System.out.println("üçgenin kenarlarını giriniz:");
        a=kenar.nextInt();
        b=kenar.nextInt();
        c=kenar.nextInt();
        u=(a+b+c)/2;
        cevre=(u*2);

      double alan=Math.sqrt(u*(u-a) * (u-b) * (u-c));
        System.out.println("üçgenin çevresi:"+cevre);
        System.out.println("üçgenin alanı:"+alan);
    }
}
