/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshopfucking1234;

/**
 *
 * @author jesperisgaard
 */
public class WorkShopFucking1234 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Constructing building management
        BuildingManagementSystemImpl buildingManagement = new BuildingManagementSystemImpl();
        
        //Creating buildings to place in buildingManagement
        Building building = new Building("Hogwarts", "Hogwarts Road 34");
        CO2Sensor co2Sensor = new CO2Sensor("Carl");
        TemperatureSensor temperatureSensor = new TemperatureSensor("Karen");
        building.addSensor(co2Sensor);
        building.addSensor(temperatureSensor);
        
        Building building1 = new Building("CareBear Factory", "Rainbow Ln 55");
        CO2Sensor co2Sensor1 = new CO2Sensor("George");
        TemperatureSensor temperatureSensor1 = new TemperatureSensor("Caitlin");
        building1.addSensor(co2Sensor1);
        building1.addSensor(temperatureSensor1);
        
        Building building2 = new Building("Trump Tower", "5th Avenue 45000");
        CO2Sensor co2Sensor2 = new CO2Sensor("Stan");
        TemperatureSensor temperatureSensor2 = new TemperatureSensor("Rachel");
        building2.addSensor(co2Sensor2);
        building2.addSensor(temperatureSensor2);
                
        
        buildingManagement.addBuilding(building);
        buildingManagement.addBuilding(building1);
        buildingManagement.addBuilding(building2);
        
    }
    
}
