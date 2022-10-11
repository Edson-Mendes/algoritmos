package br.com.emendes.sorting.run;

import br.com.emendes.sorting.run.util.Printer;
import br.com.emendes.sorting.run.util.data.UsersArrayGenerator;
import br.com.emendes.sorting.run.util.model.User;
import br.com.emendes.sorting.sort.InsertionSort;

public class InsertionSortRun {
  public static void main(String[] args) {
    User[] users = new UsersArrayGenerator().generate();

    Printer.print(users);
    new InsertionSort<User>().sort(users);
    Printer.print(users);
  }

}
