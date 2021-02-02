package io.minibuilds.traintimes.service.nre.response;

import org.simpleframework.xml.Root;

@Root(strict = false)
public class DepartureBoardStation {
  private String locationName;
  private String crs;
  private String via;

  public String getLocationName() {
    return locationName;
  }

  public String getCrs() {
    return crs;
  }

  public String getVia() {
    return via;
  }
}
