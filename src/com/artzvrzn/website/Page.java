package com.artzvrzn.website;

public abstract class Page {
  private final String pageName;

  protected Page(String pageName) {
    this.pageName = pageName;
  }

  public String getPageName() {
    return pageName;
  }
}
