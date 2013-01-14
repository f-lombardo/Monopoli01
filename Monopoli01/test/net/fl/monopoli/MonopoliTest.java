package net.fl.monopoli;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.text.StringContains.*;

import java.util.*;

import org.hamcrest.Matcher;
import org.junit.Test;

public class MonopoliTest {

  @Test
  public void test1RoundWith2Players() {
    Board board = new Board(40);
    BagOfDice dice = new BagOfDice(new FixedResultDice(1), new FixedResultDice(1));
    MockDisplay display = new MockDisplay();
    Monopoli monopoli = new Monopoli(board, dice, display);
    Player player1 = new Player("Franco");
    monopoli.addPlayer(player1);
    Player player2 = new Player("Matteo");
    monopoli.addPlayer(player2);
    monopoli.newRound();

    int roundNr = 1;
    
    assertThat(display.nextDisplayedString(), displays(roundNr));
    
    assertDisplayedPlayerMovesFromSquare0ToDestinationSquare(board, display, player1, dice);
    assertDisplayedPlayerMovesFromSquare0ToDestinationSquare(board, display, player2, dice);
    
    assertFalse(display.hasOtherDisplayString());
  }

  private void assertDisplayedPlayerMovesFromSquare0ToDestinationSquare(Board board,
                                                                        MockDisplay display,
                                                                        Player player,
                                                                        BagOfDice dice) {
    assertThat(display.nextDisplayedString(), displays(player, board.square(0)));
    assertThat(display.nextDisplayedString(), displays(dice.roll()));
    assertThat(display.nextDisplayedString(), displays(player, board.square(dice.roll())));
  }

  private Matcher<String> displays(Object... objects) {
    List<Matcher<? extends String>> matchers = new ArrayList<Matcher<? extends String>>();
    for (int i = 0; i < objects.length; i++) {
      matchers.add(containsString("" + objects[i]));
    }
    return allOf(matchers);
  }

}
