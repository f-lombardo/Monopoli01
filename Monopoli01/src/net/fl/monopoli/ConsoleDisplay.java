package net.fl.monopoli;

public class ConsoleDisplay implements Display {

  @Override
  public void showRoundNr(int roundNr) {
    System.out.println("Round nr. " + roundNr);
  }

  @Override
  public void showCurrentPlayer(Player player, Square square) {
    System.out.println("Current player " +  player + " is on square " + square);
  }

  @Override
  public void showRoll(int roll) {
    System.out.println("Dice roll: " + roll);
  }

  @Override
  public void moveCurrentPlayer(Player player, Square square) {
    System.out.println("Player " + player + " moves to " + square);
  }

}
