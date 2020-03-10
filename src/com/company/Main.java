package com.company;

import java.util.*;

/*
Дан перевод некоторых величин в формате a V = b W, где a, b – числа; V, W – названия величин
        (могут быть любые), следом дана последовательность с неизвестным вторым числом в формате a
        V = ? W, необходимо найти величину, обозначенную в пропорции знаком вопроса. Ввод данных и
        вывод результата осуществляются через стандартные потоки ввода/вывода. 
        Выходной формат a V = b W. Каждое равенство пишется на отдельной строке. 
        Постарайтесь максимально продемонстрировать свои знания ООP/OOD. 
        Код должен соответствовать критериям коммерческого качества кода. 
         
        Пример: 
        Вход:
        1024 byte = 1 kilobyte 
        2 bar = 12 ring 
        16.8 ring = 2 pyramid 
        4 hare = 1 cat 
        5 cat = 0.5 giraffe 
        1 byte = 8 bit 

        15 ring = 2.5 bar 
         
        1 pyramid = ? bar 
        1 giraffe = ? hare 
        0.5 byte = ? cat 
        2 kilobyte = ? bit 
         
        Выход: 
        1 pyramid = 1.4 bar 
        1 giraffe = 40 hare 
        Conversion not possible. 
        2 kilobyte = 16384 bit

*/

/*
 * Application entry point.
 *
 * @param args application command line arguments
 */
public class Main {

    public static void main(String[] args) {
        var app = new MyApp();
        app.run(args);
    }
}
