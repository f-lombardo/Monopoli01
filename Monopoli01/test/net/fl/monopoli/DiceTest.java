package net.fl.monopoli;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class DiceTest {

  @Test
  public void diceRollsAreBetween1AndNuberOfSides() {
    int sides = 6;
    Dice dice = new Dice(sides);
    for (int i = 0; i < 100; i++) {
      int roll = dice.roll();
      assertTrue("Too low value for roll: " + roll, roll >= 1);
      assertTrue("Too big value for roll: " + roll, roll <= sides);
    }
  }
  
  @Test
  public void diceRollsSeemRandomGenerated() throws Exception {
    int sides = 6;
    Dice dice = new Dice(sides);
    int turns = 100;
    int[] results = countFrequencyOfRollsResults(sides, dice, turns);
    int difference = results[results.length-1] - results[0];
    assertTrue("Too perfect distribution", difference > 0);
    assertTrue("Too inperfect distribution", difference < (turns/2));
  }

  private int[] countFrequencyOfRollsResults(int sides, Dice dice, int turns) {
    int results[] = new int[sides];
    for (int i = 0; i < turns; i++) {
      int roll = dice.roll();
      results[roll-1]++;
    }
    Arrays.sort(results);
    return results;
  }

}
