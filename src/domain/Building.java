package domain;

import java.util.Collection;
import java.util.HashSet;
import acq.IBuilding;
import acq.ISensor;

public class Building implements IBuilding {
  /**
   * Name of the building
   */
  private String name;

  /**
   * Address of the building
   */
  private String address;

  /**
   * Collection of available sensors
   */
  private Collection<ISensor> sensors = new HashSet<>();

  /**
   * Create a new instance of a Building
   * @param  name
   * @param  address
   * @return Building instance
   */
  public Building (String name, String address) {
    this.name = name;
    this.address = address;
  }

  /**
   * Create a new instance of a Building
   * @param  name
   * @param  address
   * @param  sensors
   * @return Building instance
   */
  public Building (String name, String address, ISensor[] sensors) {
    this(name, address);

    for (ISensor sensor : sensors) {
      this.sensors.add(sensor);
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
   * Getter address
   * @return the address attribute
   */
  public String getAddress () {
    return this.address;
  }

  /**
   * Getter sensors
   * @return the sensors attribute
   */
  public Collection<ISensor> getSensors () {
    return this.sensors;
  }

  /**
   * Add sensor to the sensors collection
   * @param   sensor
   * @return  true if the sensor was successfully added
   */
  public boolean add (ISensor sensor) {
    return this.sensors.add(sensor);
  }

  /**
   * Remove sensor from the sensors collection
   * @param  sensor
   * @return true if the sensor was successfully removed
   */
  public boolean remove (ISensor sensor) {
    return this.sensors.remove(sensor);
  }

}
