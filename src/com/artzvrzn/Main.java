package com.artzvrzn;

import com.artzvrzn.credicard.CardType;
import com.artzvrzn.credicard.CreditCard;
import com.artzvrzn.credicard.CreditCardFactory;
import com.artzvrzn.website.Website;
import com.artzvrzn.website.WebsiteFactory;
import com.artzvrzn.website.WebsiteType;

public class Main {

  public static void main(String[] args) {

    Website website = WebsiteFactory.getWebsite(WebsiteType.BLOG);
    System.out.println(website.getPages());

//    int score = 300;
//    CreditCardFactory cardFactory = CreditCardFactory.getCreditCardFactory(score);
//    CreditCard card = cardFactory.getCreditCard(CardType.PLATINUM);
//
//    System.out.println(card);
  }
}
