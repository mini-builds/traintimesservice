package io.minibuilds.traintimes.model;

import java.util.List;

public class TrainService {
  private final String time;
  private final String expectedTime;
  private final List<CallingPoint> callingPoints;

  public TrainService(String time, String expectedTime, List<CallingPoint> callingPoints) {
    this.time = time;
    this.expectedTime = expectedTime;
    this.callingPoints = callingPoints;
  }

  public String getTime() {
    return time;
  }

  public String getExpectedTime() {
    return expectedTime;
  }

  public List<CallingPoint> getCallingPoints() {
    return callingPoints;
  }
}
