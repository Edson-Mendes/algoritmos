package br.com.emendes.sorting.run;

import br.com.emendes.sorting.sort.HeapSort;

public class HeapSortRun {

  public static void main(String[] args) {
    Integer[] array = {6, 8, 2, 1, 5, 19, 19, 19, 3, 4, 10, 10, 11, 1, 2, 100, 23, 44, 55};
//    int[] array = {100, 3, 2, 17, 19, 36, 1, 25, 7};
//    int[] array = {2, 4, 3, 1};

    show(array);
    new HeapSort<Integer>().sort(array);
    show(array);
  }

  public static void show(Object[] array) {
    for (Object o : array) {
      System.out.print(o + " ");
    }
    System.out.println();
  }

}
