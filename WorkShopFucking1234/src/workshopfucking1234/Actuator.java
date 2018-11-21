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
public abstract class Actuator extends FuckingUnit {

    private int desiredValue;

    public Actuator(String name) {
        super(name);
    }

    public abstract void setValue(int value);

    public abstract int getValue();

}
