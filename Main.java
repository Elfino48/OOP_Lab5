/*

Кенгерли Эльмар, ИП-72 Вариант 13, уровень Б.

Створити шаблон класу, в якому міститься масив об’єктів заданого типу, крім базових типів,
у шаблоні необхідно передбачити використання користувацьких типів, таких як Fraction і String. 
Для користувацьких типів перегрузити усі необхідні для маніпуляцій операції.
Розробити для даного класу алгоритми сортування злиттям.
Продемонструвати усі дії з об’єктом даного класу на декількох типів даних.

*/

public class Main {

    public static void main(String[] args) {

        String stringArr[] = {"3","2","1","4"};
        Integer intArr[] = {0, 2, 1, 4};
        Fraction frArr[] = {
                new Fraction("3/2"), new Fraction("3/4"),
                new Fraction("10/2"), new Fraction("1/10")
        };

        System.out.println("STRING:");

        for (String a : stringArr) {
            System.out.print(a + " ");
        }

        System.out.print("\n");

        MergeSortStation<String> station1 = new MergeSortStation<>();
        stringArr = station1.mergeSort(stringArr);

        for (String a : stringArr) {
            System.out.print(a + " ");
        }

        System.out.println("\nINTEGER:");

        for (int a : intArr) {
            System.out.print(a + " ");
        }

        System.out.print("\n");

        MergeSortStation<Integer> station2 = new MergeSortStation<>();
        intArr = station2.mergeSort(intArr);

        for (int a : intArr) {
            System.out.print(a + " ");
        }

        System.out.println("\nFRACTION:");

        for (Fraction a : frArr) {
            System.out.print(a.show() + " ");
        }

        System.out.print("\n");

        MergeSortStation<Fraction> station3 = new MergeSortStation<>();
        frArr = station3.mergeSort(frArr);

        for (Fraction a : frArr) {
            System.out.print(a.show() + " ");
        }

    }
}
