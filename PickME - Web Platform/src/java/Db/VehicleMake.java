package Db;
// Generated Mar 9, 2015 10:30:38 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * VehicleMake generated by hbm2java
 */
public class VehicleMake  implements java.io.Serializable {


     private Integer vehicleMakeId;
     private String vehicleMake;
     private Set vehicleModels = new HashSet(0);

    public VehicleMake() {
    }

    public VehicleMake(String vehicleMake, Set vehicleModels) {
       this.vehicleMake = vehicleMake;
       this.vehicleModels = vehicleModels;
    }
   
    public Integer getVehicleMakeId() {
        return this.vehicleMakeId;
    }
    
    public void setVehicleMakeId(Integer vehicleMakeId) {
        this.vehicleMakeId = vehicleMakeId;
    }
    public String getVehicleMake() {
        return this.vehicleMake;
    }
    
    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }
    public Set getVehicleModels() {
        return this.vehicleModels;
    }
    
    public void setVehicleModels(Set vehicleModels) {
        this.vehicleModels = vehicleModels;
    }




}


