package acq;

import java.util.Collection;

public interface ISensor {

  public String getName();

  public ISensorType getType();

  public Collection<IPoint> getData();

  public boolean add(double value);

}
