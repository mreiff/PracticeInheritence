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
public class HourlyEmployee implements Employee{

    @Override
    public void salary() {
        System.out.println("50");
    }

    @Override
    public void hours() {
        System.out.println("40");
    }

    @Override
    public void commission() {
        System.out.println("0.10");
    }

    @Override
    public void pay() {
        System.out.println((50*40));
    }
    
}
