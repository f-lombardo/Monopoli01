package net.fl.monopoli;

import java.util.*;

public class Monopoli {

  private BagOfDice dice;
  private List<Player> playerList;
  private Display display;
  private Board board;

  public Monopoli(Board board, BagOfDice dice, Display display) {
    this.board = board;
    this.dice = dice;
    this.display = display;
    this.playerList = new ArrayList<Player>();
  }

  public void addPlayer(Player player) {
    this.playerList.add(player);
  }

}
