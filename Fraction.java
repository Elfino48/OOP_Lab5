/*

Кенгерли Эльмар, ИП-72 Вариант 13, уровень Б.

Створити шаблон класу, в якому міститься масив об’єктів заданого типу, крім базових типів,
у шаблоні необхідно передбачити використання користувацьких типів, таких як Fraction і String. 
Для користувацьких типів перегрузити усі необхідні для маніпуляцій операції.
Розробити для даного класу алгоритми сортування злиттям.
Продемонструвати усі дії з об’єктом даного класу на декількох типів даних.

*/

public class MergeSortStation < T > {

 public T[] mergeSort(T[] array) {
  if (array.length > 1) {
   T[] left = leftHalf(array);
   T[] right = rightHalf(array);

   mergeSort(left);
   mergeSort(right);

   merge(array, left, right);
  }
  return array;
 }

 public T[] leftHalf(T[] array) {
  int size1 = array.length / 2;
  T[] left = (T[]) new Object[size1];

  for (int i = 0; i < size1; i++) {
   left[i] = array[i];
  }

  return left;
 }

 public T[] rightHalf(T[] array) {
  int size1 = array.length / 2;
  int size2 = array.length - size1;
  T[] right = (T[]) new Object[size2];
  for (int i = 0; i < size2; i++) {
   right[i] = array[i + size1];
  }
  return right;
 }

 public void merge(T[] result, T[] left, T[] right) {
  int i1 = 0;
  int i2 = 0;

  for (int i = 0; i < result.length; i++) {
   if (i2 >= right.length || (i1 < left.length && ((left[i1].toString()).compareTo(right[i2].toString())) > 0)) {
    result[i] = left[i1];
    i1++;
   } else {
    result[i] = right[i2];
    i2++;
   }
  }
 }


}
