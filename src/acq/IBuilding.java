package acq;

import java.util.Collection;

public interface IBuilding {

  public String getName();

  public String getAddress();

  public Collection<ISensor> getSensors();

  public boolean add(ISensor sensor);

  public boolean remove(ISensor sensor);

}
