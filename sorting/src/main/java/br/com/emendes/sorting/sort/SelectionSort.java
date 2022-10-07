package br.com.emendes.sorting.sort;

public class SelectionSort<T extends Comparable<T>> {

  public void sort(T[] array) {
    int length = array.length;
    int i;
    int j;
    int positionSmaller;
    T aux;

    for (i = 0; i < length; i++) {
      positionSmaller = i;
      for (j = i + 1; j < length; j++){
//        Busca qual o index do menor elemento no resto do array que não está ordenado.
        if (biggerThan(array[positionSmaller], array[j])) {
          positionSmaller = j;
        }
      }
      aux = array[i];
      array[i] = array[positionSmaller];
      array[positionSmaller] = aux;
    }
  }

  /**
   * Método auxiliar para saber se um objeto é maior que outro.
   * @return true se o1 maior que o2, false caso contrário.
   */
  private boolean biggerThan(T o1, T o2){
    return o1.compareTo(o2) > 0;
  }

}
