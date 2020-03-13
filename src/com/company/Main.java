package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //Входящий параметр: отсортированный массив типа int который содержит отрицательные и положительные значения.
//Вернуть отсортированный массив который состоит из квадратов значений.
//Input: [-4,-1,0,3,10]
//Output: [0,1,9,16,100]

        int[] arr = {-4,-1,0,3,10};
        int[] newArr = getSortedPow(arr);
        System.out.println(Arrays.toString(newArr));
        System.out.println("test");
    }

    private static int[] getSortedPow(int[] arr) {
        return Arrays.stream(arr)
                .map((x)-> x * x)
                .sorted()
                .toArray();
    }

}
