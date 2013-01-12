package net.fl.monopoli;
import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;


public class MonopoliTest {

  @Test
  public void startUpInitializesGame() {
    List<Squares> squares = new ArrayList<Squares>();
    List<Dice> diceList = new ArrayList<Dice>();
    Monopoli monopoli = new Monopoli(squares, diceList);
    monopoli.addPlayer(new Player("Franco"));
  }

}
