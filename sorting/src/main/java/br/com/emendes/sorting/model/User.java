package br.com.emendes.sorting.model;

public record User(String name) implements Comparable<User> {

  @Override
  public int compareTo(User o) {
    return this.name.compareTo(o.name);
  }

  @Override
  public String toString() {
    return name;
  }
}
