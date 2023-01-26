package br.com.emendes.sorting.sort;

public class MergeSort {

  public void sort(int[] array) {
    mergeSort(array, 0, array.length - 1);
  }

  private void mergeSort(int[] array, int leftIndex, int rightIndex) {
    if (leftIndex >= rightIndex) return;

    int midIndex = (leftIndex + rightIndex)/2;

    // Divide o array em duas partes.
    mergeSort(array, leftIndex, midIndex);
    mergeSort(array, midIndex + 1, rightIndex);

    // Conquista, junta as duas partes ordenadas
    merge(array, leftIndex, rightIndex, midIndex);
  }

  private void merge(int[] array, int leftIndex, int rightIndex, int midIndex) {
    int[] aux = new int[rightIndex - leftIndex + 1];

    int currentLeftIndex = leftIndex;
    int currentRightIndex = midIndex + 1;
    int indexAux = 0;

    while (currentLeftIndex <= midIndex && currentRightIndex <= rightIndex) {
      if (array[currentLeftIndex] > array[currentRightIndex]) {
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
      array[leftIndex] = aux[indexAux];
      leftIndex++;
    }
  }

}
