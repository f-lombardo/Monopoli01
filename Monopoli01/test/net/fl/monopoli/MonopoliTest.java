package net.fl.monopoli;

import org.junit.Test;

public class MonopoliTest {

  @Test
  public void test1RoundWith2Players() {
    MonopoliTestFixture fixture = 
        new MonopoliTestFixture(new Board(40),
                                new BagOfDice(new FixedResultDice(1), new FixedResultDice(1)));
    Player player1 = new Player("Franco");
    fixture.monopoli.addPlayer(player1);
    
    Player player2 = new Player("Matteo");
    fixture.monopoli.addPlayer(player2);
    
    fixture.monopoli.newRound();

    int roundNr = 1;
    
    fixture.assertDisplayed(roundNr);
    
    assertDisplayedPlayerMovesFromSquare0ToDestinationSquare(player1, fixture);
    assertDisplayedPlayerMovesFromSquare0ToDestinationSquare(player2, fixture);
    
    fixture.assertNothingToDisplay();
  }

  private void assertDisplayedPlayerMovesFromSquare0ToDestinationSquare(Player player,
                                                                        MonopoliTestFixture fixture) {
    fixture.assertDisplayed(player, fixture.board.square(0));
    fixture.assertDisplayed(fixture.dice.roll());
    fixture.assertDisplayed(player, fixture.board.square(fixture.dice.roll()));
  }


}
