package domain;

import java.util.HashSet;
import java.util.Collection;
import acq.ISensor;
import acq.ISensorType;
import acq.IPoint;

public class Sensor implements ISensor {
  /**
   * Name of the sensor
   */
  private String name;

  /**
   * Type of the sensor
   */
  private final ISensorType type;

  /**
   * A collection of the collected data
   */
  private Collection<IPoint> data = new HashSet<>();

  /**
   * Create a new instance of Sensor
   * @param  name
   * @param  type
   * @return instance of Sensor
   */
  public Sensor (String name, ISensorType type) {
    this.name = name;
    this.type = type;
  }

  /**
   * Create a new instance of sensor with data
   * @param  name
   * @param  type
   * @param  points
   * @return instance of Sensor
   */
  public Sensor (String name, ISensorType type,  IPoint[] points) {
    this(name, type);

    for (IPoint point : points) {
      this.data.add(point);
    }
  }

  /**
   * Getter name
   * @return the name attribute
   */
  public String getName () {
    return this.name;
  }

  /**
   * Getter type
   * @return the type attribute
   */
  public ISensorType getType () {
    return this.type;
  }

  /**
   * Getter data
   * @return the data attribute
   */
  public Collection<IPoint> getData () {
    return this.data;
  }

  /**
   * Add a data point to the data collection
   * @param  double value
   * @return true if the value was successfully added
   */
  public boolean add (double value) {
    return this.data.add(
      this.type.compute(value)
    );
  }

}
