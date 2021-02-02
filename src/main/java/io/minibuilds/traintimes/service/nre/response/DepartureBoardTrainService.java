package io.minibuilds.traintimes.service.nre.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class DepartureBoardTrainService {
  @Element(name="std")
  private String time;

  @Element(name="etd")
  private String expectedTime;

  @Element(name="platform")
  private String platform;

  @Element(name="operator")
  private String operator;

  @Element(name="operatorCode")
  private String operatorCode;

  @Element(name="serviceType")
  private String serviceType;

  @Element(name="serviceID")
  private String serviceId;

  @Element(name="rsid")
  private String rsId;

  @Element(name="origin")
  private DepartureBoardLocation origin;

  @Element(name="destination")
  private DepartureBoardLocation destination;

  @Element(name="subsequentCallingPoints")
  private DepartureBoardCallingPoints callingPoints;

  public String getTime() {
    return time;
  }

  public String getExpectedTime() {
    return expectedTime;
  }

  public String getPlatform() {
    return platform;
  }

  public String getOperator() {
    return operator;
  }

  public String getOperatorCode() {
    return operatorCode;
  }

  public String getServiceType() {
    return serviceType;
  }

  public String getServiceId() {
    return serviceId;
  }

  public String getRsId() {
    return rsId;
  }

  public DepartureBoardLocation getOrigin() {
    return origin;
  }

  public DepartureBoardLocation getDestination() {
    return destination;
  }

  public DepartureBoardCallingPoints getCallingPoints() {
    return callingPoints;
  }
}
