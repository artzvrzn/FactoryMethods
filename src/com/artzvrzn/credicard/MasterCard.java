package com.artzvrzn.credicard;

public abstract class MasterCard extends CreditCard{

  public MasterCard(CardType type) {
    super("5678", type);
  }
}
