package io.minibuilds.traintimes.service.nre.request;

import org.simpleframework.xml.Element;

public class GetDepBoardWithDetailsRequestHeader {
  @Element(name = "typ:AccessToken", required = false)
  private final AccessToken header;

  public GetDepBoardWithDetailsRequestHeader(AccessToken header) {
    this.header = header;
  }

  public AccessToken getHeader() {
    return header;
  }
}
