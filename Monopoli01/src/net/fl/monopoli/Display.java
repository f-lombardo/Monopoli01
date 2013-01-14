package net.fl.monopoli;

public interface Display {
  public void showRoundNr(int roundNr);
  public void showCurrentPlayer(Player player, Square square);
  public void showRoll(int roll);
  public void moveCurrentPlayer(Player player, Square square);
}
