/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 *
 * @author mreiff
 */
public abstract class Employee {
    private double hours;
    private double salary;
    private double commission;    
    private double pay = (salary * hours) + ((salary * hours) + commission);

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(double hours, double salary) {
        this.hours = hours;
        this.salary = salary;
    }

    public Employee(double hours, double salary, double commission) {
        this.hours = hours;
        this.salary = salary;
        this.commission = commission;
    }
    
    

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    
    
}
