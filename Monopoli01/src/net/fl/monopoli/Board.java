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
    this.players.put(player, 0);
  }

  public Square status(Player franco) {
    return square(this.players.get(franco));
  }

  public Square square(int i) {
    return squares[i];
  }

}
