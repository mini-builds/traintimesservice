package io.minibuilds.traintimes.service.nre.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.ArrayList;
import java.util.List;

public class DepartureBoardStationBoard {
  @ElementList(name = "nrccMessages", required = false)
  private ArrayList<String> nrccMessages;

  @Element(name = "generatedAt")
  private String generatedAt;

  @Element(name = "locationName")
  private String locationName;

  @Element(name = "crs")
  private String crs;

  @Element(name = "filterLocationName")
  private String filterLocationName;

  @Element(name = "filtercrs")
  private String filterCrs;

  @Element(name = "platformAvailable")
  private boolean platformAvailable;

  @ElementList(name = "trainServices")
  private ArrayList<DepartureBoardTrainService> departureBoardTrainServices;

  public List<String> getNrccMessages() {
    return nrccMessages;
  }

  public String getGeneratedAt() {
    return generatedAt;
  }

  public String getLocationName() {
    return locationName;
  }

  public String getCrs() {
    return crs;
  }

  public String getFilterLocationName() {
    return filterLocationName;
  }

  public String getFiltercrs() {
    return filterCrs;
  }

  public boolean getPlatformAvailable() {
    return platformAvailable;
  }

  public List<DepartureBoardTrainService> getTrainServices() {
    return departureBoardTrainServices;
  }
}
