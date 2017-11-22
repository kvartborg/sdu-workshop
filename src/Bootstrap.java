import domain.*;
import acq.*;
import java.util.*;

public class Bootstrap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ISensor temp = new Sensor("Test temperatur", new SensorType("Temperatur", "C"));
      ISensor co2  = new Sensor("Test CO2", new SensorType("CO2", "ppm^2"));

      temp.add(22);
      temp.add(23);
      temp.add(21);
      temp.add(24);
      temp.add(24);
      temp.add(21);

      co2.add(4729);

      IBuilding building = new Building("Test building", "Test location", new ISensor[]{
        temp,
        co2
      });

      for (ISensor sensor : building.getSensors()) {
        System.out.println(sensor.getName() + ':');

        for (IPoint point : sensor.getData()) {
          System.out.println(point.getTimestamp() + " : " + point.getValue() + " " + sensor.getType().getUnit());
        }
      }
    }

}
