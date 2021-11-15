package com.artzvrzn.credicard;

public class MasterCardFactory extends CreditCardFactory {

  @Override
  public CreditCard getCreditCard(CardType type) {
    switch (type) {
      case GOLD:
        return new MasterCardGold();
      case PLATINUM:
        return new MasterCardBrilliant();
      case CLASSIC:
        return new MasterCardStandard();
      default:
        throw new IllegalArgumentException();
    }
  }

}
