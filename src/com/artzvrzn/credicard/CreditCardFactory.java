package com.artzvrzn.credicard;

public abstract class CreditCardFactory {

  //ABSTRACT FACTORY

  public static CreditCardFactory getCreditCardFactory(int score) {
    if (score < 500) {
      return new AmericanExpressFactory();
    }
    else if (score < 800) {
      return new MasterCardFactory();
    }
    else {
      return new VisaFactory();
    }
  }

  public abstract CreditCard getCreditCard(CardType type);

}
