package br.com.emendes.sorting.run;

import br.com.emendes.sorting.run.util.Printer;
import br.com.emendes.sorting.run.util.data.UsersArrayGenerator;
import br.com.emendes.sorting.run.util.model.User;
import br.com.emendes.sorting.sort.QuickSort;

public class QuickSortRun {

  public static void main(String[] args) {
    User[] users = new UsersArrayGenerator().generate();
    Printer.printArray(users);
    new QuickSort<User>().sort(users);
    Printer.printArray(users);
  }

}
