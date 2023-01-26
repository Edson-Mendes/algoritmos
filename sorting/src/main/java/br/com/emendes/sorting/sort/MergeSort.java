package br.com.emendes.sorting.sort;

public class MergeSort<T extends Comparable<T>> implements Sort<T> {

  @Override
  public void sort(T[] array) {
    mergeSort(array, 0, array.length - 1);
  }

  private void mergeSort(T[] array, int leftIndex, int rightIndex) {
    if (leftIndex >= rightIndex) return;

    int midIndex = (leftIndex + rightIndex)/2;

    // Divide o array em duas partes.
    mergeSort(array, leftIndex, midIndex);
    mergeSort(array, midIndex + 1, rightIndex);

    // Conquista, junta as duas partes ordenadas
    merge(array, leftIndex, rightIndex, midIndex);
  }

  private void merge(T[] array, int leftIndex, int rightIndex, int midIndex) {
    Object[] aux = new Object[rightIndex - leftIndex + 1]; // Não sei se é possível criar um array de generics

    int currentLeftIndex = leftIndex;
    int currentRightIndex = midIndex + 1;
    int indexAux = 0;

    while (currentLeftIndex <= midIndex && currentRightIndex <= rightIndex) {
      if (array[currentLeftIndex].compareTo(array[currentRightIndex]) > 0) {
        aux[indexAux] = array[currentRightIndex];
        currentRightIndex++;
      } else {
        aux[indexAux] = array[currentLeftIndex];
        currentLeftIndex++;
      }
      indexAux++;
    }

    while (currentLeftIndex <= midIndex) {
      aux[indexAux] = array[currentLeftIndex];
      indexAux++;
      currentLeftIndex++;
    }

    while (currentRightIndex <= rightIndex) {
      aux[indexAux] = array[currentRightIndex];
      indexAux++;
      currentRightIndex++;
    }

    for (indexAux = 0; indexAux < aux.length; indexAux++) {
      array[leftIndex] = (T) aux[indexAux];
      leftIndex++;
    }
  }

}
