package net.fl.monopoli;

import java.util.*;

public class MockDisplay implements Display {

  private List<String> history = new ArrayList<String>(); 

  private Iterator<String> historyIterator;
  
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

  public String nextDisplayedString() {
    initIterator();
    return historyIterator.next();
  }

  private void initIterator() {
    if (historyIterator == null) {
      historyIterator = history.iterator();
    }
  }

  public boolean hasOtherDisplayString() {
    initIterator();
    return historyIterator.hasNext();
  }
}
