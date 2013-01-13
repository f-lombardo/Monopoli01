package net.fl.monopoli;

import java.util.*;


public class Board {

  private Square[] squares;
  private Map<Player, Integer> players;

  public Board(int nrOfSquares) {
    this.squares = new Square[nrOfSquares];
    this.squares[0] = new Square("Go");
    for (int i = 1; i < this.squares.length; i++) {
      this.squares[i] = new Square("Square " + i);
    }
    
    this.players = new HashMap<Player, Integer>();
  }

  public void addPlayer(Player player) {
    setPosition(player, 0);
  }

  public Square status(Player player) {
    return square(currentSquareIndex(player));
  }

  private Integer currentSquareIndex(Player player) {
    return this.players.get(player);
  }

  public Square square(int i) {
    return squares[i];
  }

  public void move(Player player, int movementSize) {
    setPosition(player, (currentSquareIndex(player) + movementSize) % squares.length);
  }

  private void setPosition(Player player, int position) {
    this.players.put(player, position);
  }

}
