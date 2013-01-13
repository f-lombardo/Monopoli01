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
  public boolean equals(Object obj) {
    return (obj instanceof Square && ((Square)obj).name.equals(name));
  }
}
