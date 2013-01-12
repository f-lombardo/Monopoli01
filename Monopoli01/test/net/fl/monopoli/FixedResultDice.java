package net.fl.monopoli;

public class FixedResultDice extends Dice {

  private int fixedResult;

  public FixedResultDice(int fixedResult) {
    super(1);
    this.fixedResult = fixedResult;
  }

  @Override
  public int roll() {
    return this.fixedResult;
  }
}
