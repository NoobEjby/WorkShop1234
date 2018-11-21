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
        Building building = new Building("Hogwarts", "Hogwarts Road 34"); 
        Building building1 = new Building("CareBear Factory", "Rainbow Ln 55");
        Building building2 = new Building("Trump Tower", "5th Avenue 45000");
        buildingManagement.addBuilding(building);
        buildingManagement.addBuilding(building1);
        buildingManagement.addBuilding(building2);
        
        //Building
        buildingManagement.addCo2Sensor(building.getId(), "Carl");
        buildingManagement.addTemperatureSensor(building.getId(), "Karen");
       
        //Building1
        buildingManagement.addCo2Sensor(building1.getId(), "George");
        buildingManagement.addTemperatureSensor(building1.getId(), "Caitlin");
        
        //Building2
        buildingManagement.addCo2Sensor(building2.getId(), "Stan");
        buildingManagement.addTemperatureSensor(building2.getId(), "Rachel");
        
        System.out.println(buildingManagement.getBuildings());

    }

}
