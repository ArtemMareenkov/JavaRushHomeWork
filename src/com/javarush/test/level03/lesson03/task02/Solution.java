package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
        int eur = 30;
        double course = 4.6;
        double converter= convertEurToUsd(eur,course);
        System.out.println(converter);
        System.out.println(converter);
    }

    public static double convertEurToUsd(int eur, double course){
        double dollarUSA;
        dollarUSA = eur*course;
        return dollarUSA;
    }
}
