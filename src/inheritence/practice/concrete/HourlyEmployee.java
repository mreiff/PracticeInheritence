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
public class HourlyEmployee extends Employee{

    public HourlyEmployee(double salary, double hours) {
        super(salary, hours);
    }
    // the property is in the other class
}
