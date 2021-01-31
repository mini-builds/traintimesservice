package io.minibuilds.traintimes.model;

public class CallingPoint {
  private final String location;
  private final String time;
  private final String expectedTime;

  public CallingPoint(String location, String time, String expectedTime) {
    this.location = location;
    this.time = time;
    this.expectedTime = expectedTime;
  }

  public String getLocation() {
    return location;
  }

  public String getTime() {
    return time;
  }

  public String getExpectedTime() {
    return expectedTime;
  }
}
