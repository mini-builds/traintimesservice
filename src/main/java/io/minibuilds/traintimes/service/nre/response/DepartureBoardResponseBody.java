package io.minibuilds.traintimes.service.nre.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Body", strict = false)
public class DepartureBoardResponseBody {
  @Element(name = "GetDepBoardWithDetailsResponse")
  private DepartureBoardResponse departure;

  public DepartureBoardResponse getDeparture() {
    return departure;
  }

}
