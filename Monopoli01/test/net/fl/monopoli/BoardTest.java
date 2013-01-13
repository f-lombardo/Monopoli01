package net.fl.monopoli;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class BoardTest {

  @Test
  public void aPlayerIsInitiallyOnTheGoSquare() {
    Board board = new Board(40);
    Player franco = new Player("Franco");
    board.addPlayer(franco);
    assertThat(board.status(franco), is(board.square(0)));
  }
  
  @Test
  public void aPlayerCanMoveRoundlyOnTheBoard() {
    int nrOfSquares = 40;
    Board board = new Board(nrOfSquares);
    Player franco = new Player("Franco");
    board.addPlayer(franco);
    board.move(franco, 1);
    assertThat(board.status(franco), is(board.square(1)));
    board.move(franco, nrOfSquares);
    assertThat(board.status(franco), is(board.square(1)));
  }

  @Test
  public void aBoarHasAsManySquaresAsInitiallyStated() throws Exception {
    Board board = new Board(2);
    assertNotNull(board.square(0));
    assertNotNull(board.square(1));
    try {
      assertNull(board.square(2));
      fail("There should not be square 2");
    } catch (Exception e) {
    }
    assertFalse(board.square(0).equals(board.square(1)));
  }
}
