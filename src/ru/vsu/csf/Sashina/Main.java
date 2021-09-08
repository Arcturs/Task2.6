package ru.vsu.csf.Sashina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите размер изначальной хеш-таблицы: ");
        Scanner scan = new Scanner(System.in);
        int capacity = scan.nextInt();
        System.out.println();
        System.out.print("Введите уровень заполняемости таблицы (число от 0 до 1): ");
        double loadFactor = scan.nextDouble();
        SimpleHashMap<Integer, Integer> map = new SimpleHashMap<>(capacity, loadFactor);
        System.out.println();
        System.out.print("Введите ключ: ");
        int key = scan.nextInt();
        System.out.println();
        System.out.print("Введите значение: ");
        int s = scan.nextInt();
        System.out.println();
       while (s != 0) {
           map.put(key, s);
           System.out.print("Введите ключ: ");
           key = scan.nextInt();
           System.out.println();
           System.out.print("Введите значение: ");
           s = scan.nextInt();
           System.out.println();
        }
    }
}
