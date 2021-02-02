package io.minibuilds.traintimes.service.nre.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class DepartureBoardCallingPoint {
  @Element(name="locationName")
  private String locationName;

  @Element(name="crs")
  private String crs;

  @Element(name="st")
  private String time;

  @Element(name="et")
  private String expectedTime;

  public String getLocationName() {
    return locationName;
  }

  public String getCrs() {
    return crs;
  }

  public String getTime() {
    return time;
  }

  public String getExpectedTime() {
    return expectedTime;
  }
}
