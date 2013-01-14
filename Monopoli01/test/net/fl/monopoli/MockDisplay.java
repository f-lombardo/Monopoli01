package net.fl.monopoli;

import java.util.*;

public class MockDisplay implements Display {

  public List<String> history = new ArrayList<String>(); 

  @Override
  public void showRoundNr(int roundNr) {
    history.add("" + roundNr);
  }

  @Override
  public void showCurrentPlayer(Player player, Square status) {
    history.add(player + "#" + status);
  }

  @Override
  public void showRoll(int roll) {
    history.add("" + roll);
  }

  @Override
  public void moveCurrentPlayer(Player player, Square status) {
    history.add(player + "#" + status);
  }

}
