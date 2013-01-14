package net.fl.monopoli;

public class BagOfDice {

  private Dice[] dice;

  public BagOfDice(Dice ...dice) {
    this.dice = dice;
  }
  
  public int roll() {
    int result = 0;
    for (int i = 0; i < dice.length; i++) {
      result += dice[i].roll();
    }
    return result;
  }

  public static BagOfDice ofDice(int nrOfDice, int sides) {
    Dice[] dice = new Dice[nrOfDice];
    for (int i = 0; i < dice.length; i++) {
      dice[i] = new Dice(sides);
    }
    return new BagOfDice(dice);
  }

}
