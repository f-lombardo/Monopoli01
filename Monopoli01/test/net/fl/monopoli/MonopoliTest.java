package net.fl.monopoli;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;


public class MonopoliTest {

  @Test
  public void startUpInitializesGame() {
    Board board = new Board(40);
    BagOfDice dice = new BagOfDice(new Dice(6), new Dice(6));
    Display display = new MockDisplay();
    Monopoli monopoli = new Monopoli(board, dice, display);
    monopoli.addPlayer(new Player("Franco"));
    monopoli.addPlayer(new Player("Matteo"));
  }

}
