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
public class HourlyEmployee extends Employee{

    public HourlyEmployee(double hours, double salary) {
        super(hours, salary);
    }
   // the propertie(s) are in the superclass

    @Override
    public void totalSalary() {
        System.out.println(50);
    }

    @Override
    public void totalHours() {
        System.out.println(40);
    }

    @Override
    public void percentCommission() {
        System.out.println(10% (.10));
    }

    @Override
    public void totalPay() {
        System.out.println(40*50 + ((40*50) * .10));
    }
    
}
