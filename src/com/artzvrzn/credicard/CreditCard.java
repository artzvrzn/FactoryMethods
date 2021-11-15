package com.artzvrzn.credicard;

import java.util.Random;

public abstract class CreditCard {
  private final String cardNumber;
  private final CardType type;
  private boolean valid;

  protected CreditCard(String firstFourDigits, CardType type) {
    String lastTwelveDigits = new Random().
        longs(1000_0000_0000L, 9999_9999_9999L).
        toString();
    this.cardNumber = firstFourDigits + lastTwelveDigits;
    this.type = type;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public CardType getType() {
    return type;
  }

  public boolean isValid() {
    return valid;
  }

  public void setValid(boolean valid) {
    this.valid = valid;
  }
}
