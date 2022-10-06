package br.com.emendes.sorting.sort;

public class InsertionSort<T extends Comparable<T>> {

  public void sort(T[] array){
    int length = array.length;
    T key;
    int i;
    int j;
    for (i = 1; i < length; i++) {
      key = array[i];
      j = i-1;
      while(j >= 0 && biggerThan(array[j], key)){
        // move o elemento maior que key para a direita.
        array[j+1] = array[j];
        j--;
      }
//      Quando o key não for menor que o elemento, ou j < 0,
//      coloca-se key imediatamente a direita do elemento.
      array[j+1] = key;
    }
  }

  /**
   * Verifica se {@code o1} é maior que {@code o2}.
   * @return {@code true} se o1 maior que o2, {@code false} caso contrário.
   */
  private boolean biggerThan(T o1, T o2){
    return o1.compareTo(o2) > 0;
  }

}
