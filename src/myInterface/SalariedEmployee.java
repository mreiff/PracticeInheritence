/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myInterface;

/**
 *
 * @author mreiff
 */
public class SalariedEmployee implements Employee{

    @Override
    public void totalSalary() {
        System.out.println("50");
    }

    @Override
    public void totalHours() {
        System.out.println("40");
    }

    @Override
    public void totalCommission() {
        System.out.println("0.10");
    }

    @Override
    public void totalPay() {
        System.out.println(50);
    }
    
}
