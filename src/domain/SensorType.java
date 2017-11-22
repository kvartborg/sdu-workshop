package domain;

import acq.ISensorType;

public class SensorType implements ISensorType {
  /**
   * Name of the sensor type
   */
  private String name;

  /**
   * Unit type of the sensor type
   */
  private String unit;

  /**
   * Create a new instance of SensorType
   * @param  name
   * @param  unit
   * @return instance of SensorType
   */
  public SensorType (String name, String unit) {
    this.name = name;
    this.unit = unit;
  }

  /**
   * Getter name
   * @return the name attribute
   */
  public String getName() {
    return this.name;
  }

  /**
   * Getter unit
   * @return the unit attribute
   */
  public String getUnit() {
    return this.unit;
  }

  /**
   * Compute and create a new data point
   * @param  double value
   * @return a new data Point
   */
  public Point compute (double value) {
    return new Point(System.currentTimeMillis(), value);
  }

}
