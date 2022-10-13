package br.com.emendes.sorting.sort;

public class QuickSort {

  public void sort(int[] array){
    partition(array, 0, array.length - 1);
  }

  /**
   * Particiona o array de acordo com um pivo, nessa implementação, o pivo é o último elemento do intervalo [iIni, iEnd].<br/>
   * Tudo que for menor que o pivo fica a esquerda, e tudo que for igual ou maior fica a direita.<br/>
   * Então, recursivamente, particiona o intervalo a esquerda do pivo [iIni, posição(pivo) - 1]
   * e o intervalo a direira do pivo [posição(pivo) + 1, iEnd].
   */
  private void partition(int[] array, int iIni, int iEnd){
    if(iIni < iEnd){
      int pivot = array[iEnd];
      int i = iIni;
      int j = iEnd - 1;
      while (i <= j){
        while (array[i] < pivot){
          i+=1;
        }
        while (j > -1 && array[j] > pivot) {
          j-=1;
        }
        if (i <= j){
          swap(array, i, j);
          i+=1;
          j-=1;
        }
      }
//      Troca a posição do pivo com o último elemento encontrado que seja maior ou igual que o pivo.
      swap(array, i, iEnd);
      partition(array, iIni, i-1);
      partition(array, i+1, iEnd);
    }
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
