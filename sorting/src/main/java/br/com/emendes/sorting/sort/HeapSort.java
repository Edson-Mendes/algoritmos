package br.com.emendes.sorting.sort;

public class HeapSort {

  public void sort(int[] array) {
    int lastIndex = array.length - 1;
    buildHeap(array, lastIndex);
    swap(array, 0, lastIndex--);
    while (lastIndex > 0) {
      heapify(array, 0, lastIndex);
      swap(array, 0, lastIndex);
      lastIndex--;
    }
  }

  /**
   * Constrói uma max-heap a partir de um array.
   *
   * @param array que será transformado em um max-heap
   */
  private void buildHeap(int[] array, int lastIndex) {
    for (int i = parent(lastIndex); i >= 0; i--) {
      heapify(array, i, lastIndex);
    }
  }

  /**
   * Garante que os nodes filhos sempre serão maiores que o node pai.
   *
   * @param array   array onde será aplicado o heapify
   * @param iFather indice do node pai.
   */
  private void heapify(int[] array, int iFather, int lastIndex) {
    int iLeft = leftChild(iFather);
    int iRight = rightChild(iFather);
    int iSmaller;
    if (iLeft <= lastIndex && array[iLeft] > array[iFather])
      iSmaller = iLeft;
    else
      iSmaller = iFather;
    if (iRight <= lastIndex && array[iRight] > array[iSmaller])
      iSmaller = iRight;
    if (iSmaller != iFather) {
      swap(array, iSmaller, iFather);
      heapify(array, iSmaller, lastIndex);
    }
  }

  /**
   * Devolve o índice do node pai.
   *
   * @param iChild índice do node.
   * @return índice do node pai.
   */
  private int parent(int iChild) {
    return (iChild - 1) >> 1;
  }

  /**
   * Devolve o índice do node filho esquerdo.
   *
   * @param iFather índice do node pai.
   * @return índice do node filho esquerdo.
   */
  private int leftChild(int iFather) {
    return (iFather << 1) + 1;
  }

  /**
   * Devolve o índice do node filho direito.
   *
   * @param iFather índice do node pai.
   * @return índice do node filho direito.
   */
  private int rightChild(int iFather) {
    return (iFather + 1) << 1;
  }

  /**
   * Troca a posiçao de dois elementos.
   *
   * @param array onde ocorrerá a troca.
   * @param i1    índice do primeiro elemento.
   * @param i2    índice do segundo elemento.
   */
  private void swap(int[] array, int i1, int i2) {
    int aux = array[i1];
    array[i1] = array[i2];
    array[i2] = aux;
  }

}
