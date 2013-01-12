package net.fl.monopoli;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class BagOfDiceTest {

  @Test
  public void test() {
    int a = 5;
    int b = 3;
    BagOfDice bag = new BagOfDice(new FixedResultDice(a ), new FixedResultDice(b));
    assertThat(bag.roll(), is(a+b));
  }

}
