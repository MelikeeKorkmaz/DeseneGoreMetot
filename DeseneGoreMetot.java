import java.util.Scanner;

/*
 Girilen sayıdan, 0'a eşit veya küçük oluncaya kadar 5 çıkarıp daha sonra girilen sayıya ulaşana kadar 5 ekleyen program. Her aşamanın sonucu ekrana yazdırılır.
*/

public class DeseneGoreMetot {

    static int sumSub(int number, int i, int a) {

        if ((number > 0) && (a == 0)) {
            System.out.println(number);
            return sumSub(number - 5, i + 1, a);

        }
        if ((number <= 0) || (a == 1)) {
            System.out.println(number);
            a = 1;
            if (number == i) {
                return number;
            }
            return sumSub(number + 5, i - 1, a);
        }
        return number;
    }

    public static void main(String[] args) {
        int number, i, a = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        number = input.nextInt();
        i = number;

        sumSub(number, i, a);
    }
}
