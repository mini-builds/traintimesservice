package io.minibuilds.traintimes.model;

import java.time.LocalDateTime;
import java.util.List;

public class DepartureBoard {
  private final String from;
  private final String to;
  private final LocalDateTime updatedAt;
  private final List<TrainService> services;

  public DepartureBoard(String from, String to, LocalDateTime updatedAt, List<TrainService> services) {
    this.from = from;
    this.to = to;
    this.updatedAt = updatedAt;
    this.services = services;
  }

  public String getFrom() {
    return from;
  }

  public String getTo() {
    return to;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public List<TrainService> getServices() {
    return services;
  }
}
