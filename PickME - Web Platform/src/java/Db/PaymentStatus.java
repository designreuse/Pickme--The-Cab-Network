package Db;
// Generated Mar 9, 2015 10:30:38 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * PaymentStatus generated by hbm2java
 */
public class PaymentStatus  implements java.io.Serializable {


     private Integer paymentStatusId;
     private String paymentStatus;
     private Set membershipPaymentHistories = new HashSet(0);
     private Set servicePaymentHistories = new HashSet(0);
     private Set paidHistories = new HashSet(0);

    public PaymentStatus() {
    }

    public PaymentStatus(String paymentStatus, Set membershipPaymentHistories, Set servicePaymentHistories, Set paidHistories) {
       this.paymentStatus = paymentStatus;
       this.membershipPaymentHistories = membershipPaymentHistories;
       this.servicePaymentHistories = servicePaymentHistories;
       this.paidHistories = paidHistories;
    }
   
    public Integer getPaymentStatusId() {
        return this.paymentStatusId;
    }
    
    public void setPaymentStatusId(Integer paymentStatusId) {
        this.paymentStatusId = paymentStatusId;
    }
    public String getPaymentStatus() {
        return this.paymentStatus;
    }
    
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    public Set getMembershipPaymentHistories() {
        return this.membershipPaymentHistories;
    }
    
    public void setMembershipPaymentHistories(Set membershipPaymentHistories) {
        this.membershipPaymentHistories = membershipPaymentHistories;
    }
    public Set getServicePaymentHistories() {
        return this.servicePaymentHistories;
    }
    
    public void setServicePaymentHistories(Set servicePaymentHistories) {
        this.servicePaymentHistories = servicePaymentHistories;
    }
    public Set getPaidHistories() {
        return this.paidHistories;
    }
    
    public void setPaidHistories(Set paidHistories) {
        this.paidHistories = paidHistories;
    }




}


