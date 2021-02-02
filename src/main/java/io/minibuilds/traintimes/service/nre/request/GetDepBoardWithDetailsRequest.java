package io.minibuilds.traintimes.service.nre.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "ldb:GetDepBoardWithDetailsRequest", strict = false)
public class GetDepBoardWithDetailsRequest {

  @Element(name = "ldb:numRows")
  private final int numRows = 150;

  @Element(name = "ldb:crs")
  public final String crs;

  @Element(name = "ldb:filterCrs")
  private final String filterCrs;

  @Element(name = "ldb:filterType")
  private final String filterType = "to";


  public GetDepBoardWithDetailsRequest(String crs, String filterCrs) {
    this.crs = crs;
    this.filterCrs = filterCrs;
  }

  public String getCrs() {
    return crs;
  }

  public String getFilterCrs() {
    return filterCrs;
  }
}
