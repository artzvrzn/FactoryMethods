package com.artzvrzn.website;

public class WebsiteShop extends Website {

  @Override
  protected void setPages() {
    pages.add(new PageContact());
    pages.add(new PageComments());
    pages.add(new PagePost());
    pages.add(new PageGoods());
    pages.add(new PageInfo());
    pages.add(new PageLogin());
  }

}
