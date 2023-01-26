package br.com.emendes.sorting.run;

import br.com.emendes.sorting.run.util.data.ArrayGenerator;
import br.com.emendes.sorting.run.util.data.UsersArrayGenerator;
import br.com.emendes.sorting.run.util.model.User;
import br.com.emendes.sorting.sort.MergeSort;

import java.util.Random;

public class MergeSortRun {

  public static void main(String[] args) {

    Random rand = new Random();
    Integer[] array = new Integer[1000000];

    for (int i = 0; i < array.length; i++) {
      array[i] = rand.nextInt(100000);
    }

    long ini = System.currentTimeMillis();

    MergeSort mergeSort = new MergeSort();
    mergeSort.sort(array);

    long end = System.currentTimeMillis();

    System.out.println(end - ini);
  }

  public static void print(int[] array) {
    for (int value : array) {
      System.out.print(value + " ");
    }

    System.out.println();
  }

}
