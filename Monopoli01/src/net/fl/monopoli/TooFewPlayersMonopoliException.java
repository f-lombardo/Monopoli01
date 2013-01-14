package net.fl.monopoli;

public class TooFewPlayersMonopoliException extends MonopoliException {

  public TooFewPlayersMonopoliException() {
    super("Too few players");
  }

}
