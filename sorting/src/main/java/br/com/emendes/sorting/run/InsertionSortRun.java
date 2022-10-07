package br.com.emendes.sorting.run;

import br.com.emendes.sorting.model.User;
import br.com.emendes.sorting.sort.InsertionSort;

public class InsertionSortRun {
  public static void main(String[] args) {
    User user1 = new User("Edson");
    User user2 = new User("Débora");
    User user3 = new User("Mei");
    User user4 = new User("Kira");
    User user5 = new User("Anderson");
    User user6 = new User("Zorro");
    User user7 = new User("Edson");
    User user8 = new User("Aarthur");
    User user9 = new User("Mario");
    User user10 = new User("Zulu");
    User user11 = new User("Bruna");
    User user12 = new User("Manoel");
    User user13 = new User("Feijão");
    User user14 = new User("Loiva");
    User user15 = new User("Alvaro");
    User user16 = new User("Sofi");

    User[] users = {user1, user2, user3, user4, user5, user6, user7, user8,
        user9, user10, user11, user12, user13, user14, user15, user16};

    show(users);
    System.out.println("------------------------------------------------------------------------- ");
    InsertionSort<User> sorter = new InsertionSort<>();
    sorter.sort(users);
    show(users);
  }

  public static void show(Object[] array) {
    for (Object o : array) {
      System.out.println(o);
    }
  }

}
