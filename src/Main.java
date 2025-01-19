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
        System.out.println("\nВторое задание");
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
        System.out.println("\nТретье задание");
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " х 5 = " + (i*5));
        }

        //Четвёртое задание
        System.out.println("\nЧетвёртое задание");
        System.out.println("Введите число:");
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum+=i;
        }
        System.out.println("Сумма чисел от 1 до " + N + " равна " + sum);

        //Пятое задание
        System.out.println("\nПятое задание");
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
        System.out.println("\n\nШестое задание");
        System.out.println("Введите число:");
        num = scanner.nextInt();
        boolean isSimple = true;
        for (int i = 3; i < num; i++) {
            if(num % i == 0){
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
        System.out.println("\nСедьмое задание");
        System.out.println("Введите число:");
        num = scanner.nextInt();
        for (int i = num; i >= 0; i--) {
            System.out.print(i);
            if(i != 0){
                System.out.print(", ");
            }
        }

        //Восьмое задание
        System.out.println("\n\nВосьмое задание");
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
        System.out.println("\nДевятое задание");
        System.out.println("Введите строку:");
        scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);

        //Десятое задание
        System.out.println("\nДесятое задание");
        System.out.println("Введите число:");
        String number = scanner.nextLine();
        System.out.println("Колчество цифр в числе: " + number.length());

        //Одиннадцатое задание
        System.out.println("\nОдиннадцатое задание");
        System.out.println("Введите число:");
        N = scanner.nextInt();
        int res = 1;
        for (int i = 1; i <= N; i++) {
            res*=i;
        }
        System.out.println("Факториал числа " + N + " равен " + res);

        //Двенадцатое задание
        System.out.println("\nДвенадцатое задание");
        System.out.println("Введите число:");
        scanner = new Scanner(System.in);
        number = scanner.nextLine();
        sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }
        System.out.println("Сумма цифр числа " + number + " равна " + sum);

        //Тринадцатое задание
        System.out.println("\nТринадцатое задание");
        System.out.println("Введите строку:");
        str = scanner.nextLine();
        result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        if (result.equals(str)){
            System.out.println("Введённая строка является палиндромом");
        }else {
            System.out.println("Введённая строка не является палиндромом");
        }

        //Четырнадцатое задание
        System.out.println("\nЧетырнадцатое задание");
        System.out.println("Введите размер массива:");
        int mas_len = scanner.nextInt();
        System.out.println("Введите элементы массива:");
        int [] mas = new int[mas_len];
        for (int i = 0; i < mas_len; i++) {
            mas[i] = scanner.nextInt();
        }
        int mas_max = 0;
        for (int i = 0; i < mas_len; i++) {
            if(mas[i] > mas_max){
                mas_max = mas[i];
            }
        }
        System.out.println("Максимальное число массива: " + mas_max);

        //Пятнадцатое задание
        System.out.println("\nПятнадцатое задание");
        System.out.println("Введите размер массива:");
        mas_len = scanner.nextInt();
        System.out.println("Введите элементы массива:");
        mas = new int[mas_len];
        for (int i = 0; i < mas_len; i++) {
            mas[i] = scanner.nextInt();
        }
        sum = 0;
        for (int i = 0; i < mas_len; i++) {
            sum += mas[i];
        }
        System.out.println("Сумма элементов массива равна " + sum);

        //Шестнадцатое задание
        System.out.println("\nШестнадцатое задание");
        System.out.println("Введите размер массива:");
        mas_len = scanner.nextInt();
        System.out.println("Введите элементы массива:");
        mas = new int[mas_len];
        for (int i = 0; i < mas_len; i++) {
            mas[i] = scanner.nextInt();
        }
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < mas_len; i++) {
            if(mas[i] >= 0) {
                positive++;
            } else {
                negative++;
            }
        }
        System.out.println("В массиве " + positive + " положительных чисел и " + negative + " отрицательных");

        //Семнадцатое задание
        System.out.println("\nСемнадцатое задание");
        System.out.println("Введите два числа:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        String results = "";

        if (a < b) {
            for (int i = a; i <= b; i++) {
                isSimple = true;
                for (int j = 2; j < i; j++) {
                    if(i % j == 0){
                        isSimple = false;
                        break;
                    }
                }
                if (isSimple) {
                    results += i + " ";
                }
            }
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                isSimple = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isSimple = false;
                        break;
                    }
                }
                if (isSimple) {
                    results += i + " ";
                }
            }
        }
        System.out.println("В диапазоне содержатся следующие простые числа:\n"+results);

        //Восемнадцатое задание
        System.out.println("\nВосемнадцатое задание");
        System.out.println("Введите предложение:");
        char [] vowel = {'а', 'у', 'о', 'и', 'э', 'ы', 'ю', 'я', 'е', 'ё'};
        scanner = new Scanner(System.in);
        str = scanner.nextLine();
        char letter;
        int vowels_total = 0;
        int consonant_total = 0;
        boolean isVowel;
        for (int i = 0; i < str.length(); i++) {
            isVowel = false;
            letter = str.charAt(i);
            for(char ch : vowel){
                if(letter == ch){
                    vowels_total++;
                    isVowel = true;
                    break;
                }
            }
            if(!isVowel && letter!=' '){
                consonant_total++;
            }
        }
        System.out.println("Во введённом предложении " + vowels_total + " гласных и " + consonant_total + " согласных");

        //Девятнадцатое задание
        System.out.println("\nДевятнадцатое задание");
        System.out.println("Введите предложение:");
        str = scanner.nextLine();
        String [] str_mas = str.split(" ");
        String out = "";
        for (int i = 0; i < str_mas.length; i++) {
            out = str_mas[i] + " " + out;
        }
        System.out.println("Перевернутое предложение: " + out);

        //Двадцатое задание
        System.out.println("\nДвадцатое задание");
        String armstrong_num = scanner.nextLine();
        sum = 0;
        for (int i = 0; i < armstrong_num.length(); i++) {
            sum += Math.pow(Character.getNumericValue(armstrong_num.charAt(i)), armstrong_num.length());
        }
        if(Integer.parseInt(armstrong_num) == sum){
            System.out.println("Является числом Армстронга");
        } else{
            System.out.println("Не является числом Армстронга");
        }
    }
}