package net.fl.monopoli;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.text.StringContains.*;

import java.util.Iterator;

import org.junit.Test;


public class MonopoliTest {

  @Test
  public void test1RoundWith2Players() {
    Board board = new Board(40);
    BagOfDice dice = new BagOfDice(new FixedResultDice(1), new FixedResultDice(1));
    MockDisplay display = new MockDisplay();
    Monopoli monopoli = new Monopoli(board, dice, display);
    monopoli.addPlayer(new Player("Franco"));
    monopoli.addPlayer(new Player("Matteo"));
    monopoli.newRound();
    
    Iterator<String> istoryLog = display.history.iterator();
    
    assertThat(istoryLog.next(), containsString("1"));
    
    assertThat(istoryLog.next(), allOf(containsString("Franco"), 
                                       containsString(board.square(0).toString())));
    assertThat(istoryLog.next(), containsString("2"));
    assertThat(istoryLog.next(), allOf(containsString("Franco"), 
                                       containsString(board.square(2).toString())));
    assertThat(istoryLog.next(), allOf(containsString("Matteo"), 
                                       containsString(board.square(0).toString())));
    assertThat(istoryLog.next(), containsString("2"));
    assertThat(istoryLog.next(), allOf(containsString("Matteo"), 
                                       containsString(board.square(2).toString())));
    
    assertFalse(istoryLog.hasNext());
  }

}
