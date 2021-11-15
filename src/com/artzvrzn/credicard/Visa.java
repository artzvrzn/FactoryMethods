package com.artzvrzn.credicard;

public abstract class Visa extends CreditCard {

  protected Visa(CardType type) {
    super("1234", type);
  }

}
