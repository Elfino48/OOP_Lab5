/*

Кенгерли Эльмар, ИП-72 Вариант 13, уровень Б.

Створити шаблон класу, в якому міститься масив об’єктів заданого типу, крім базових типів,
у шаблоні необхідно передбачити використання користувацьких типів, таких як Fraction і String. 
Для користувацьких типів перегрузити усі необхідні для маніпуляцій операції.
Розробити для даного класу алгоритми сортування злиттям.
Продемонструвати усі дії з об’єктом даного класу на декількох типів даних.

*/

public class Fraction {

 int numerator;
 int denumerator;
 double value;

 Fraction(String val) {
  String dr[] = val.split("/");
  this.denumerator = Integer.valueOf(dr[1]);
  this.numerator = Integer.valueOf(dr[0]);
  value = ((double) numerator / (double) denumerator);
 }

 public double getDouble() {

  return ((double) numerator / (double) denumerator);

 }

 public String toString() {

  return (String.valueOf(value));

 }

 public String show() {

  return (numerator + "/" + denumerator);

 }

}
