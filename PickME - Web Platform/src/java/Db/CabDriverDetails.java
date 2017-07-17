package Db;
// Generated Mar 9, 2015 10:30:38 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * CabDriverDetails generated by hbm2java
 */
public class CabDriverDetails  implements java.io.Serializable {


     private Integer cabDriverDetailsId;
     private City city;
     private String firstName;
     private String lastName;
     private String dob;
     private String address1;
     private String address2;
     private Set cabDrivers = new HashSet(0);

    public CabDriverDetails() {
    }

	
    public CabDriverDetails(City city) {
        this.city = city;
    }
    public CabDriverDetails(City city, String firstName, String lastName, String dob, String address1, String address2, Set cabDrivers) {
       this.city = city;
       this.firstName = firstName;
       this.lastName = lastName;
       this.dob = dob;
       this.address1 = address1;
       this.address2 = address2;
       this.cabDrivers = cabDrivers;
    }
   
    public Integer getCabDriverDetailsId() {
        return this.cabDriverDetailsId;
    }
    
    public void setCabDriverDetailsId(Integer cabDriverDetailsId) {
        this.cabDriverDetailsId = cabDriverDetailsId;
    }
    public City getCity() {
        return this.city;
    }
    
    public void setCity(City city) {
        this.city = city;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDob() {
        return this.dob;
    }
    
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getAddress1() {
        return this.address1;
    }
    
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    public String getAddress2() {
        return this.address2;
    }
    
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    public Set getCabDrivers() {
        return this.cabDrivers;
    }
    
    public void setCabDrivers(Set cabDrivers) {
        this.cabDrivers = cabDrivers;
    }




}


