/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshopfucking1234;

import java.util.UUID;

/**
 *
 * @author jesperisgaard
 */
public abstract class FuckingUnit {
    private String name;
    private UUID id;

    public FuckingUnit(String name){
        this.name = name;
        this.id = UUID.randomUUID();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public UUID getId(){
        return id;
    }
    
    
    @Override
    public String toString(){
        return "Something went wrong";
    }
}
