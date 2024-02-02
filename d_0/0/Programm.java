package ex00;
/*
Java является строго типизированным языком программирования.
Фундаментальные типы данных (boolean, character, integer, floating point number)
представлены в Java восемью примитивными типами: boolean, char, byte, short, int, long, float, double.
Работа с типом integer.
Вычислить сумму цифр шестизначного числа int
(значение числа задается непосредственно в коде путем явной инициализации переменной number).
Пример работы программы для числа 479598:
 */
public class Program {
    public static void main(String[] args) {
        int number = 479598;
        int res = 0;
        while (number > 0) {
            res += number % 10;
            number = number / 10;
        }
        System.out.println(res);
    }
}
