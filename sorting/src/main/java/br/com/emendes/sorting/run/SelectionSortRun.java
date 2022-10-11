package br.com.emendes.sorting.run;

import br.com.emendes.sorting.run.util.Printer;
import br.com.emendes.sorting.run.util.data.UsersArrayGenerator;
import br.com.emendes.sorting.run.util.model.User;
import br.com.emendes.sorting.sort.SelectionSort;

public class SelectionSortRun {

  public static void main(String[] args) {
    User[] users = new UsersArrayGenerator().generate();

    Printer.print(users);
    new SelectionSort<User>().sort(users);
    Printer.print(users);
  }
}
