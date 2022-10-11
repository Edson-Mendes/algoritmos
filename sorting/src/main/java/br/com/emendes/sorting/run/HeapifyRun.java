package br.com.emendes.sorting.run;

import br.com.emendes.sorting.sort.HeapSort;

public class HeapifyRun {

  public static void main(String[] args) {
//    int[] array = {6, 8, 2, 1, 5};
    int[] array = {100, 3, 2, 17, 19, 36, 1, 25, 7};

    show(array);
    new HeapSort().buildHeap(array);
    show(array);
  }

  public static void show(int[] array) {
    for (int o : array) {
      System.out.print(o + " ");
    }
    System.out.println();
  }

  public static void divider() {
    System.out.println("--------------------------------------------------------------------------------");
  }

}
