/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshopfucking1234;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Noob
 */
public class Building extends FuckingUnit {

    private List<Sensor> sensors;
    private List<Actuator> actuators;
    private String address;

    public Building(String name, String address) {
        super(name);
        this.address = address;
        actuators = new ArrayList<>();
        sensors = new ArrayList<>();
    }

    public List<Sensor> getSensors() {
        return sensors;

    }

    public List<Actuator> getActuators() {
        return actuators;

    }

    public void addSensor(Sensor s) {
        sensors.add(s);
    }

    public void removeSensor(UUID id) {
        sensors.remove(id);
    }

    public void addActuator(Actuator a) {
        actuators.add(a);
    }

    public void removeActuator(UUID id) {
        actuators.remove(id);
    }
    
    
}
