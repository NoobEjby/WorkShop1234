/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshopfucking1234;

import java.util.UUID;

/**
 *
 * @author Noob
 */
public class VentilationActuator extends Actuator {

    int value;

    public VentilationActuator(String name) {
        super(name);
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "STAHP";
    }

}
