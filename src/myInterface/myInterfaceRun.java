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
public class myInterfaceRun {
    public static void main(String[] args) {
        // TODO code application logic here
        SalariedEmployee salEmployee = new SalariedEmployee();
        HourlyEmployee hourEmployee = new HourlyEmployee();
        SalaryPlusCommissionEmployee salPlusCommEmployee = new SalaryPlusCommissionEmployee();
        
        System.out.println("salary employee");
        salEmployee.totalSalary();
        salEmployee.totalHours();
        System.out.println("hourly employee");
        hourEmployee.totalHours();
        hourEmployee.totalSalary();
        System.out.println("salary plus commission employee");
        salPlusCommEmployee.totalSalary();
        salPlusCommEmployee.totalHours();
        salPlusCommEmployee.totalCommission();
        salPlusCommEmployee.totalPay();
    }
}
