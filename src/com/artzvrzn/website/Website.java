package com.artzvrzn.website;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

  List<Page> pages = new ArrayList<>();

  public Website() {
    this.setPages();
  }

  public List<Page> getPages() {
    return pages;
  }

  protected abstract void setPages();

}
