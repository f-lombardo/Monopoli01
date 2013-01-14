package net.fl.monopoli;

public class TooMuchPlayersMonopoliException extends MonopoliException {

  public TooMuchPlayersMonopoliException() {
    super("Too much players");
  }

}
