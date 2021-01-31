package io.minibuilds.traintimes.service.nre.request;

import org.simpleframework.xml.Element;

public class GetDepBoardWithDetailsRequestBody {
  @Element(name = "ldb:GetDepBoardWithDetailsRequest", required = false)
  private final GetDepBoardWithDetailsRequest request;

  public GetDepBoardWithDetailsRequestBody(GetDepBoardWithDetailsRequest request) {
    this.request = request;
  }

  public GetDepBoardWithDetailsRequest getRequest() {
    return request;
  }
}
