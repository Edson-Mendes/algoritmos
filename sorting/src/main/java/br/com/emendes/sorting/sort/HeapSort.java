package br.com.emendes.sorting.sort;

public class HeapSort {


  public void sort(int[] array) {

  }

  /**
   * Constrói uma max-heap a partir de um array.
   * @param array que será virará um max-heap
   */
  public void buildHeap(int[] array) {
    for (int i = parent(array.length - 1); i >= 0; i--){
      heapify(array, i);
    }
  }

  /**
   * Garante que os nodes filhos sempre serão maiores que o node pai.
   * @param array array onde será aplicado o heapify
   * @param iFather indice do node pai.
   */
  private void heapify(int[] array, int iFather) {
    int iLeft = leftChild(iFather);
    int iRight = rightChild(iFather);
    int iSmaller;
    if (iLeft < array.length && array[iLeft] > array[iFather]) iSmaller = iLeft;
    else iSmaller = iFather;
    if (iRight < array.length && array[iRight] > array[iSmaller]) iSmaller = iRight;
    if (iSmaller != iFather) {
      int aux = array[iFather];
      array[iFather] = array[iSmaller];
      array[iSmaller] = aux;
      heapify(array, iSmaller);
    }
  }

  /**
   * Devolve o índice do node pai.
   * @param iChild índice do node.
   * @return índice do node pai.
   */
  private int parent(int iChild) {
    return (iChild - 1) >> 1;
  }

  /**
   * Devolve o índice do node filho esquerdo.
   * @param iFather índice do node pai.
   * @return índice do node filho esquerdo.
   */
  private int leftChild(int iFather) {
    return (iFather << 1) + 1;
  }

  /**
   * Devolve o índice do node filho direito.
   * @param iFather índice do node pai.
   * @return índice do node filho direito.
   */
  private int rightChild(int iFather) {
    return (iFather + 1) << 1;
  }

}
