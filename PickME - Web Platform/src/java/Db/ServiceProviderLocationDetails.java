package Db;
// Generated Mar 9, 2015 10:30:38 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * ServiceProviderLocationDetails generated by hbm2java
 */
public class ServiceProviderLocationDetails  implements java.io.Serializable {


     private Integer serviceProviderLocationDetailsId;
     private City city;
     private String address1;
     private String address2;
     private Double lattitude;
     private Double longitude;
     private Set serviceProviders = new HashSet(0);

    public ServiceProviderLocationDetails() {
    }

	
    public ServiceProviderLocationDetails(City city) {
        this.city = city;
    }
    public ServiceProviderLocationDetails(City city, String address1, String address2, Double lattitude, Double longitude, Set serviceProviders) {
       this.city = city;
       this.address1 = address1;
       this.address2 = address2;
       this.lattitude = lattitude;
       this.longitude = longitude;
       this.serviceProviders = serviceProviders;
    }
   
    public Integer getServiceProviderLocationDetailsId() {
        return this.serviceProviderLocationDetailsId;
    }
    
    public void setServiceProviderLocationDetailsId(Integer serviceProviderLocationDetailsId) {
        this.serviceProviderLocationDetailsId = serviceProviderLocationDetailsId;
    }
    public City getCity() {
        return this.city;
    }
    
    public void setCity(City city) {
        this.city = city;
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
    public Double getLattitude() {
        return this.lattitude;
    }
    
    public void setLattitude(Double lattitude) {
        this.lattitude = lattitude;
    }
    public Double getLongitude() {
        return this.longitude;
    }
    
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    public Set getServiceProviders() {
        return this.serviceProviders;
    }
    
    public void setServiceProviders(Set serviceProviders) {
        this.serviceProviders = serviceProviders;
    }




}


