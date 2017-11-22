package acq;

public interface ISensorType {

  public String getName();

  public String getUnit();

  public IPoint compute(double value);

}
