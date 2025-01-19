import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Первое задание
        System.out.println("Первое задание");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для проверки:");
        int num = scanner.nextInt();
        if (num%2 == 0){
            System.out.println("Число чётное");
        }
        else {
            System.out.println("Число нечётное");
        }

        //Второе задание
        System.out.println("Второе задание");
        System.out.println("Введите три числа для проверки:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a < b && a < c){
            System.out.println("Число " + a + " наименьшее");
        } else if (b < a && b < c) {
            System.out.println("Число " + b + " наименьшее");
        } else if (c < a && c < b) {
            System.out.println("Число " + c + " наименьшее");
        } else {
            System.out.println("Одно из чисел равно другому");
        }

        //Третье задание
        System.out.println("Третье задание");
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " х 5 = " + (i*5));
        }

        //Четвёртое задание
        System.out.println("Четвёртое задание");
        System.out.println("Введите число:");
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum+=i;
        }
        System.out.println("Сумма чисел от 1 до " + N + " равна " + sum);

        //Пятое задание
        System.out.println("Пятое задание");
        System.out.println("Введите число N:");
        N = scanner.nextInt();
        int first = 0;
        int second = 1;
        if (N == 1) {
            System.out.println(first);
        } else if (N == 2) {
            System.out.println(first + ", " + second);
        } else {
            System.out.print(first + ", " + second + ", ");
            for (int i = 2; i < N; i++) {
                sum = first+second;
                first = second;
                second = sum;
                System.out.print(sum);
                if(i!=N-1){
                    System.out.print(", ");
                }
            }
        }

        //Шестое задание
        System.out.println("\nШестое задание");
        System.out.println("Введите число:");
        num = scanner.nextInt();
        boolean isSimple = true;
        for (int i = 2; i < num; i++) {
            if(num % 2 == 0){
                isSimple = false;
                break;
            }
        }
        if(isSimple){
            System.out.println("Число является простым");
        }else{
            System.out.println("Число не является простым");
        }

        //Седьмое задание
        System.out.println("Седьмое задание");
        System.out.println("Введите число:");
        num = scanner.nextInt();
        for (int i = num; i > 0; i--) {
            System.out.print(i);
            if(i != 0){
                System.out.print(", ");
            }
        }

        //Восьмое задание
        System.out.println("\nВосьмое задание");
        System.out.println("Введите два числа:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        sum = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            System.out.println("Сумма чисел равна " + sum);
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
            System.out.println("Сумма чисел равна " + sum);
        } else {
            System.out.println("Сумма чисел равна " + a);
        }

        //Девятое задание
        System.out.println("Девятое задание");
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);
    }
}