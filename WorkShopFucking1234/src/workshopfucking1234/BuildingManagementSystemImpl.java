/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshopfucking1234;

import com.sun.javafx.print.Units;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Noob
 */
public class BuildingManagementSystemImpl {
    private List<Building> buildings;

    public BuildingManagementSystemImpl() {
        buildings = new ArrayList<>();
    }
    
    
    public List<Building> getBuildings(){
        return buildings;
    }
    
    public void addBuilding(Building b){
        buildings.add(b);
                
    }
    public void removeBuilding(UUID id){
        
        for (Building b : buildings) {
            if (id == b.getId()) {
                buildings.remove(b);
                
            }
            
        }
        
    }
    
}
