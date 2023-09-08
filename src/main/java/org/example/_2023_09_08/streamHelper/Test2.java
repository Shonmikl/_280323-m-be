package org.example._2023_09_08.streamHelper;

import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    /**
     * Дан список строк, каждая строка содержит название города и его
     * население в тысячах человек, разделенных запятой. Необходимо найти топ N городов с
     * наибольшим населением. Напишите метод, который принимает список строк и число N и
     * возвращает список топ N городов.
     */

    private static List<String> getTopNCities(List<String> cities, int n) {
        return cities.stream()
                .map(city -> city.split(","))//[New York, 15000][Berlin, 10000]
                .sorted((c1, c2) -> Integer.compare(Integer.parseInt(c2[1].trim()), Integer.parseInt(c1[1].trim())))
                .limit(n)
                .map(city -> city[0] + " : " + city[1])
                .collect(Collectors.toList());

    }

    /**
     * Допустим, у вас есть двумерный массив строк, представляющий
     * таблицу данных, где первый столбец - это имена, а остальные столбцы -
     * это числовые значения. Вам нужно написать программу, которая найдет среднее
     * значение для каждого числового столбца, игнорируя строки, которые не могут быть
     * преобразованы в числа.
     * требуется
     * использовать несколько функций Stream API и регулярных выражений для обработки данных
     * String[][] data = {
     *                 {"name1", "10", "20", "30"},
     *                 {"name2", "40", "50", "not a number"},
     *                 {"name3", "60", "70", "80"}
     *         };
     */

    public static void main(String[] args) {
        List<String> stringList = List.of("Moscow,15000", "New York, 12000", "Riga, 800", "Berlin,8000", "Shanghai,25000");
        int top = 3;
        System.out.println(getTopNCities(stringList, top));
    }
}