package net.fl.monopoli;

import java.util.*;

public class Monopoli {

  private static final int MAX_PLAYERS = 8;
  private static final int MIN_PLAYERS = 2;
  
  private BagOfDice dice;
  private List<Player> playerList;
  private Display display;
  private Board board;
  private int roundNr;

  public Monopoli(Board board, BagOfDice dice, Display display) {
    this.board = board;
    this.dice = dice;
    this.display = display;
    this.playerList = new ArrayList<Player>();
    this.roundNr = 0;
  }

  public void addPlayer(Player player) {
    if (this.playerList.size() > MAX_PLAYERS) {
      throw new TooMuchPlayersMonopoliException();
    }
    this.playerList.add(player);
    this.board.addPlayer(player);
  }

  public void newRound() {
    checkPlayerNr();
    this.roundNr++;
    display.showRoundNr(this.roundNr);
    for (Player player : playerList) {
      newTurnFor(player);
    }
  }

  private void newTurnFor(Player player) {
    display.showCurrentPlayer(player, board.status(player));
    int roll = dice.roll();
    display.showRoll(roll);
    board.move(player, roll);
    display.moveCurrentPlayer(player, board.status(player));
  }

  private void checkPlayerNr() {
    if (this.playerList.size() < MIN_PLAYERS) {
      throw new TooFewPlayersMonopoliException();
    }
  }

}
