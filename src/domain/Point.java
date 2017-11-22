package domain;

import acq.IPoint;

public class Point implements IPoint {

  /**
   * Timestamp in milliseconds
   */
  private long timestamp;

  /**
   * Value
   */
  private double value;

  /**
   * Create a new instance of Point
   * @param  timestamp
   * @param  value
   * @return Point instance
   */
  public Point (long timestamp, double value) {
    this.timestamp = timestamp;
    this.value = value;
  }

  /**
   * Getter timestamp
   * @return the timestamp attribute
   */
  public long getTimestamp () {
    return this.timestamp;
  }

  /**
   * Getter value
   * @return the value attribute
   */
  public double getValue () {
    return this.value;
  }
}
