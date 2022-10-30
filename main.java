import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int a,b;
        String islem;

        Scanner grs = new Scanner(System.in);

        System.out.println("ilk sayiyi giriniz");

        a=grs.nextInt();

        System.out.println("islemi giriniz");

        islem=grs.next();

        System.out.println("ikinci sayiyi giriniz");

        b=grs.nextInt();

        switch (islem) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("yanlis islem girdiniz");
        }





    }
}
