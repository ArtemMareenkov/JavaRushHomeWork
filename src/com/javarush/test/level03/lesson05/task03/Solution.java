package com.javarush.test.level03.lesson05.task03;

/* Конвертер времени
Добавьте метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
*/

public class Solution
{
    public static int convertToSeconds(int hour){
      int hourtosecond;
      hourtosecond = hour*60*60;
      return hourtosecond;
    }

    public static void main(String[] args) {
        int hour = 45;
        int convert = convertToSeconds(hour);
        System.out.println(convert);
        System.out.println(convert);
    }
}