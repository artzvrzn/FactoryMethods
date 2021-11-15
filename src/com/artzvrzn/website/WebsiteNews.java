package com.artzvrzn.website;

public class WebsiteNews extends Website {

  @Override
  protected void setPages() {
    pages.add(new PageContact());
    pages.add(new PageComments());
    pages.add(new PagePost());
    pages.add(new PageNews());
    pages.add(new PageInfo());
    pages.add(new PageLogin());
  }

}
