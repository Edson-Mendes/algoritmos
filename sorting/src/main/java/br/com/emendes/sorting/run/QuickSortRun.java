package br.com.emendes.sorting.run;

import br.com.emendes.sorting.sort.QuickSort;

public class QuickSortRun {

  public static void main(String[] args) {
//    int[] array = {100, 3, 2, 17, 19, 36, 1, 25, 7};
//    int[] array = {100, 3, 2, 17, 19, 36, 1, 25, 7, 17, 2, 1, 5, 18, 14, 12, 100, 2, 6, 98};
//    int[] array = {10, 4, 7, 8,2, 9, 10, 12, 2, 3, 5, 6, 1, 2, 9, 4, 4, 1, 7, 9};
    int[] array = {
        100, 12, 15, 99, 30, 20, 28, 29, 50, 42,
        79, 10, 20, 99, 20, 34, 81, 22, 21, 38,
        49, 60, 11, 14, 91, 77, 32, 59, 60, 92
    };
    show(array);
    new QuickSort().sort(array);
    show(array);
  }

  public static void show(int[] array) {
    for (int v : array) {
      System.out.print(v + " ");
    }
    System.out.println();
  }

}
