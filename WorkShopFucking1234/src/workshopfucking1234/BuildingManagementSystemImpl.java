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

    public List<Building> getBuildings() {
        return buildings;
    }

    public void addBuilding(Building b) {
        buildings.add(b);

    }

    public void removeBuilding(UUID id) {

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
        Building building = getBuilding(buildingId);
        if (getBuilding(buildingId).getId() == buildingId) {
            building.getSensors();
            for (Sensor sens : building.getSensors()) {
                sensorMap.put(sens.getId(), sens.getName());
            }
        }

        return sensorMap;
    }

    @Override
    public Map<UUID, String> getActuatorInformation(UUID buildingId) {
        Map<UUID, String> actuatorMap = new HashMap<>();
        Building building = getBuilding(buildingId);
        if (building.getId() == buildingId) {
            building.getActuators();
            for (Actuator actuator : building.getActuators()) {
                actuatorMap.put(actuator.getId(), actuator.getName());
            }
        }

        return actuatorMap;
    }

    @Override
    public UUID addTemperatureSensor(UUID buildingId, String name) {
        TemperatureSensor temp = new TemperatureSensor(name);
        for (Building building : getBuildings()) {
            if (building.getId() == buildingId) {
                building.addSensor(temp);

            }

        }
        return temp.getId();
    }

    @Override
    public UUID addCo2Sensor(UUID buildingId, String name) {
        Building building = getBuilding(buildingId);
        if (building.getId() == buildingId) {
            CO2Sensor co2Sensor = new CO2Sensor(name);
            building.addSensor(co2Sensor);
            return building.getId();
        }

        return null;
    }

    @Override
    public void removeSensor(UUID buildingId, UUID sensorId) {
        Building building = getBuilding(buildingId);
        List<Sensor> list = building.getSensors();
        for (Sensor sensor : list) {
            if (sensor.getId().equals(sensorId)) {
                building.getSensors().remove(sensor);
            }
        }
    }

    @Override
    public UUID addVentilationActuator(UUID buildingId, String name) {
        Building building = getBuilding(buildingId);
        Actuator actuator = new VentilationActuator(name);
        building.addActuator(actuator);
        return actuator.getId();
    }

    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Building getBuilding(UUID ID) {
        for (Building building : getBuildings()) {
            if (building.getId() == ID) {
                return building;
            }
        }
        return null;
    }
}
