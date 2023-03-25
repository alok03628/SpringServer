package com.employeemanage.springserver.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeInput {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int receiptNo;
    private int date;
    private String partyName;
    private String address;
    private String paymentType;
    private  int amount;
    private String empName;

    public int getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(int receiptNo) {
        this.receiptNo = receiptNo;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "receiptNo=" + receiptNo +
                ", date=" + date +
                ", partyName='" + partyName + '\'' +
                ", address='" + address + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", amount=" + amount +
                ", empName='" + empName + '\'' +
                '}';
    }
}
