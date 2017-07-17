package Db;
// Generated Mar 9, 2015 10:30:38 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * PayLaterService generated by hbm2java
 */
public class PayLaterService  implements java.io.Serializable {


     private Integer payLaterServiceId;
     private ServiceStatus serviceStatus;
     private User user;
     private ServiceProvider serviceProvider;
     private ServiceDuration serviceDuration;
     private double basicPayment;
     private Date payDate;
     private Date agreedDate;
     private double currentBalance;
     private Date expireDate;
     private Set paidHistories = new HashSet(0);
     private Set payLaterItems = new HashSet(0);

    public PayLaterService() {
    }

	
    public PayLaterService(ServiceStatus serviceStatus, User user, ServiceProvider serviceProvider, ServiceDuration serviceDuration, double basicPayment, Date payDate, double currentBalance) {
        this.serviceStatus = serviceStatus;
        this.user = user;
        this.serviceProvider = serviceProvider;
        this.serviceDuration = serviceDuration;
        this.basicPayment = basicPayment;
        this.payDate = payDate;
        this.currentBalance = currentBalance;
    }
    public PayLaterService(ServiceStatus serviceStatus, User user, ServiceProvider serviceProvider, ServiceDuration serviceDuration, double basicPayment, Date payDate, Date agreedDate, double currentBalance, Date expireDate, Set paidHistories, Set payLaterItems) {
       this.serviceStatus = serviceStatus;
       this.user = user;
       this.serviceProvider = serviceProvider;
       this.serviceDuration = serviceDuration;
       this.basicPayment = basicPayment;
       this.payDate = payDate;
       this.agreedDate = agreedDate;
       this.currentBalance = currentBalance;
       this.expireDate = expireDate;
       this.paidHistories = paidHistories;
       this.payLaterItems = payLaterItems;
    }
   
    public Integer getPayLaterServiceId() {
        return this.payLaterServiceId;
    }
    
    public void setPayLaterServiceId(Integer payLaterServiceId) {
        this.payLaterServiceId = payLaterServiceId;
    }
    public ServiceStatus getServiceStatus() {
        return this.serviceStatus;
    }
    
    public void setServiceStatus(ServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public ServiceProvider getServiceProvider() {
        return this.serviceProvider;
    }
    
    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
    public ServiceDuration getServiceDuration() {
        return this.serviceDuration;
    }
    
    public void setServiceDuration(ServiceDuration serviceDuration) {
        this.serviceDuration = serviceDuration;
    }
    public double getBasicPayment() {
        return this.basicPayment;
    }
    
    public void setBasicPayment(double basicPayment) {
        this.basicPayment = basicPayment;
    }
    public Date getPayDate() {
        return this.payDate;
    }
    
    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }
    public Date getAgreedDate() {
        return this.agreedDate;
    }
    
    public void setAgreedDate(Date agreedDate) {
        this.agreedDate = agreedDate;
    }
    public double getCurrentBalance() {
        return this.currentBalance;
    }
    
    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }
    public Date getExpireDate() {
        return this.expireDate;
    }
    
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
    public Set getPaidHistories() {
        return this.paidHistories;
    }
    
    public void setPaidHistories(Set paidHistories) {
        this.paidHistories = paidHistories;
    }
    public Set getPayLaterItems() {
        return this.payLaterItems;
    }
    
    public void setPayLaterItems(Set payLaterItems) {
        this.payLaterItems = payLaterItems;
    }




}


