package io.minibuilds.traintimes.service.nre.request;

import org.simpleframework.xml.Element;

class AccessToken {
  @Element(name = "typ:TokenValue", required = false)
  public final String tokenValue;

  public AccessToken(String tokenValue) {
    this.tokenValue = tokenValue;
  }

  public String getTokenValue() {
    return tokenValue;
  }
}
