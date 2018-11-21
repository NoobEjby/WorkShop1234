/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshopfucking1234;

/**
 *
 * @author Noob
 */
public class TemperatureSensor extends Sensor {

    public TemperatureSensor(String name) {
        super(name);
    }

    @Override
    public int getValue() {
        return super.getValue();
    }

    @Override
    public String toString() {
        return "Temperature-sensor " + this.getName() + " has the ID " + this.getId() + " and the current value: " + this.getValue() + "\n";
    }

}
