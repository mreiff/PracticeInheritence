/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritence.practice.concrete;

/**
 *
 * @author mreiff
 */
public class Employee {
    double salary;
    double commission;
    double hours;
    double pay = (salary * hours) + ((salary * hours) + commission);

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(double salary, double hours) {
        this.salary = salary;
        this.hours = hours;
    }

    public Employee(double salary, double commission, double hours) {
        this.salary = salary;
        this.commission = commission;
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

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    
    
}
