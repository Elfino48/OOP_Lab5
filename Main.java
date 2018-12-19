public class Main {

    public static void main(String[] args) {

        // Створюємо масиви String, Integer та Fraction
        String stringArr[] = {"3","2","1","4"};
        Integer intArr[] = {0, 2, 1, 4};
        Fraction frArr[] = {
                new Fraction("3/2"), new Fraction("3/4"),
                new Fraction("10/2"), new Fraction("1/10")
        };


        // Перевіримо правильність роботи на типі даних
        // String

        System.out.println("STRING:");

        for (String a : stringArr) {
            // Масив ДО: 3 2 1 4
            System.out.print(a + " ");
        }

        System.out.print("\n");

        // Створюємо сортувальну станцію типу String, сортуємо масив
        MergeSortStation<String> station1 = new MergeSortStation<>();
        stringArr = station1.mergeSort(stringArr);

        for (String a : stringArr) {
            // Масив ПІСЛЯ: 4 3 2 1
            System.out.print(a + " ");
        }




        // Перевіримо правильність роботи на типі даних
        // Integer

        System.out.println("\nINTEGER:");

        for (int a : intArr) {
            // Масив ДО: 0 2 1 4
            System.out.print(a + " ");
        }

        System.out.print("\n");

        // Створюємо сортувальну станцію типу Integer, сортуємо масив
        MergeSortStation<Integer> station2 = new MergeSortStation<>();
        intArr = station2.mergeSort(intArr);

        for (int a : intArr) {
            // Масив ПІСЛЯ: 4 2 1 0
            System.out.print(a + " ");
        }



        // Перевіримо правильність роботи на типі даних
        // FRACTION

        System.out.println("\nFRACTION:");

        for (Fraction a : frArr) {
            // Масив ДО: 3/2 3/4 10/2 1/10
            System.out.print(a.show() + " ");
        }

        System.out.print("\n");

        // Створюємо сортувальну станцію типу Fraction, сортуємо масив
        MergeSortStation<Fraction> station3 = new MergeSortStation<>();
        frArr = station3.mergeSort(frArr);

        for (Fraction a : frArr) {
            // Масив ПІСЛЯ: 10/2 3/2 3/4 1/10
            System.out.print(a.show() + " ");
        }

    }
}
