package br.com.emendes.sorting.sort;

public interface Sort<T extends Comparable<T>> {

  void sort(T[] array);

}
