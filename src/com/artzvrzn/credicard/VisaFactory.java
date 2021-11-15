package com.artzvrzn.credicard;

public class VisaFactory extends CreditCardFactory {

  @Override
  public CreditCard getCreditCard(CardType type) {
    switch (type) {
      case GOLD:
        return new VisaGold();
      case PLATINUM:
        return new VisaPlatinum();
      case CLASSIC:
        return new VisaClassic();
      default:
        throw new IllegalArgumentException();
    }
  }

}
