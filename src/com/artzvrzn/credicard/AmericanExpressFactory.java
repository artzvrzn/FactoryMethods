package com.artzvrzn.credicard;

public class AmericanExpressFactory extends CreditCardFactory {

  @Override
  public CreditCard getCreditCard(CardType type) {
    switch (type) {
      case GOLD:
        return new AmericanExpressGold();
      case PLATINUM:
        return new AmericanExpressBlack();
      case CLASSIC:
        return new AmericanExpressStandard();
      default:
        throw new IllegalArgumentException();
    }
  }

}
