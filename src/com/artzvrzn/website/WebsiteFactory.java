package com.artzvrzn.website;

public abstract class WebsiteFactory {

  public static Website getWebsite(WebsiteType type) {
    switch (type) {
      case BLOG:
        return new WebsiteBlog();
      case NEWS:
        return new WebsiteNews();
      case SHOP:
        return new WebsiteShop();
      default:
        throw new IllegalArgumentException();
    }
  }
}
