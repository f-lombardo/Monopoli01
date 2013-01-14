package net.fl.monopoli;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.text.StringContains.*;

import java.util.*;

import org.hamcrest.Matcher;


public class MonopoliTestFixture {

  public final Board board;
  public final BagOfDice dice;
  private MockDisplay display;
  
  public final Monopoli monopoli;

  public MonopoliTestFixture(Board board, BagOfDice dice) {
    this.board = board;
    this.dice = dice;
    display = new MockDisplay();
    monopoli = new Monopoli(board, dice, display);
  }

  public void assertDisplayed(Object... objects) {
    assertThat(display.nextDisplayedString(), displayed(objects));
  }
  
  private Matcher<String> displayed(Object... objects) {
    List<Matcher<? extends String>> matchers = new ArrayList<Matcher<? extends String>>();
    for (int i = 0; i < objects.length; i++) {
      matchers.add(containsString("" + objects[i]));
    }
    return allOf(matchers);
  }

  public void assertNothingToDisplay() {
    assertFalse(display.hasOtherDisplayString());
  }
}
