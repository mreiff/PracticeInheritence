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
public class abstractRun {
    public static void main(String[] args) {
        // TODO code application logic here
        SalariedEmployee salEmployee = new SalariedEmployee(50,40,.10);
        HourlyEmployee hourEmployee = new HourlyEmployee(50,40);
        SalaryPlusCommissionEmployee salPlusCommEmployee = new SalaryPlusCommissionEmployee(50,40,.10);
        
        System.out.println("salary employee");
        salEmployee.totalSalary();
        System.out.println("hourly employee");
        hourEmployee.totalHours();
        System.out.println("salary plus commission employee");
        salPlusCommEmployee.totalPay();
    }
}
