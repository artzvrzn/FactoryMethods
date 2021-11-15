package com.artzvrzn.website;

public class WebsiteBlog extends Website {

  @Override
  protected void setPages() {
    pages.add(new PageContact());
    pages.add(new PageComments());
    pages.add(new PagePost());
    pages.add(new PageInfo());
  }

}
