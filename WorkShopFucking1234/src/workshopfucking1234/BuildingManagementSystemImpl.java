/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshopfucking1234;

import com.sun.javafx.print.Units;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author Noob
 */
public class BuildingManagementSystemImpl implements IBuildingManagementSystem {
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

    @Override
    public Map<UUID, String> getBuildingInformation() {
        Map<UUID, String> buildingMap = new HashMap<>();

        for (Building building : getBuildings()) {
            buildingMap.put(building.getId(), building.getName());
        }
        return buildingMap;
    }

    @Override
    public Map<UUID, String> getSensorInformation(UUID buildingId) {
        Map<UUID, String> sensorMap = new HashMap<>();
        for (Building building : getBuildings()) {
            if (building.getId() == buildingId) {
                building.getSensors();
                for (Sensor sens : building.getSensors()) {
                    sensorMap.put(sens.getId(), sens.getName());
                }
            }

        }
        return sensorMap;
    }

    @Override
    public Map<UUID, String> getActuatorInformation(UUID buildingId) {
        Map<UUID, String> actuatorMap = new HashMap<>();
        for (Building building : getBuildings()) {
            if (building.getId() == buildingId) {
                building.getActuators();
                for (Actuator actuator : building.getActuators()) {
                    actuatorMap.put(actuator.getId(), actuator.getName());
                }
            }

        }
        return actuatorMap;
    }

    @Override
    public UUID addTemperatureSensor(UUID buildingId, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UUID addCo2Sensor(UUID buildingId, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeSensor(UUID buildingId, UUID sensorId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UUID addVentilationActuator(UUID buildingId, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
