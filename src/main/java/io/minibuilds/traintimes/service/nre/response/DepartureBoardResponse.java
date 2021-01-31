package io.minibuilds.traintimes.service.nre.response;

import org.simpleframework.xml.Element;

public class DepartureBoardResponse {
  @Element(name = "GetStationBoardResult")
  private DepartureBoardStationBoard stationBoard;

  public DepartureBoardStationBoard getStationBoard() {
    return stationBoard;
  }
}
