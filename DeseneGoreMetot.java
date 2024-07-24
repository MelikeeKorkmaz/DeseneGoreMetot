import java.util.Scanner;

/*
 Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
 Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
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
