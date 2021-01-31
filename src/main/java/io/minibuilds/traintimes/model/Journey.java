package io.minibuilds.traintimes.model;

import java.util.Objects;

public class Journey {
  private final String from;
  private final String to;

  public Journey(String from, String to) {
    this.from = from;
    this.to = to;
  }

  public String getFrom() {
    return from;
  }

  public String getTo() {
    return to;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Journey that = (Journey) o;
    return Objects.equals(from, that.from) &&
        Objects.equals(to, that.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to);
  }
}
