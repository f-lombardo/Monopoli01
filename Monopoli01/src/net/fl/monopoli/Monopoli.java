package net.fl.monopoli;

import java.util.*;

public class Monopoli {

  private List<Squares> squares;
  private List<Dice> diceList;
  private List<Player> playerList;

  public Monopoli(List<Squares> squares, List<Dice> diceList) {
    this.squares = squares;
    this.diceList = diceList;
    this.playerList = new ArrayList<Player>();
  }

  public void addPlayer(Player player) {
    this.playerList.add(player);
  }

}
