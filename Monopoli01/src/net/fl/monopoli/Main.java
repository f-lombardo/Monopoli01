package net.fl.monopoli;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Welcome to the Monopoli demo");
    System.out.println("Please insert nr. of players");
    int nrOfPlayers = readNrOfPlayers();
    Monopoli monopoli = new Monopoli(new Board(40), BagOfDice.ofDice(2, 6), new ConsoleDisplay());
    addPlayers(nrOfPlayers, monopoli);
    doRounds(monopoli, 20);
    System.out.println("Thank you");
  }

  private static int readNrOfPlayers() {
    Scanner scanner = new Scanner(System.in);
    int nrOfPlayers = Integer.parseInt(scanner.nextLine().trim());
    scanner.close();
    return nrOfPlayers;
  }

  private static void doRounds(Monopoli monopoli, int rounds) {
    for(int i = 1; i <= rounds ; i++) {
      monopoli.newRound();
    }
  }

  private static void addPlayers(int nrOfPlayers, Monopoli monopoli) {
    for (int i = 1; i <= nrOfPlayers; i++) {
      monopoli.addPlayer(new Player("Player nr. " + i));
    }
  }
}
