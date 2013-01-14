package net.fl.monopoli;

public class Square {

  private String name;

  public Square(String name) {
    this.name = name;
  }

  @Override
  public int hashCode() {
    return name.hashCode();
  }
  
  @Override
  public boolean equals(Object other) {
    return (other instanceof Square && ((Square)other).name.equals(name));
  }
  
  @Override
  public String toString() {
    return this.name;
  }
}
