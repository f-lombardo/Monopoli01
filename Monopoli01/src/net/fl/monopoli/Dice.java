package net.fl.monopoli;

public class Dice {

  private static final int MIN = 1;
  
  private int sides;

  public Dice(int sides) {
    this.sides = sides;
  }

  public int roll() {
    return MIN + (int)(Math.random() * ((sides - MIN) + 1));
  }

}
