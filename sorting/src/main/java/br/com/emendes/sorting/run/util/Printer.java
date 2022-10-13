package br.com.emendes.sorting.run.util;

public class Printer {

  /**
   * Imprime o array no console.
   */
  public static void printArray(Object[] array) {
    for (Object o : array) {
      System.out.print(o + " ");
    }
    System.out.println();
  }

}
