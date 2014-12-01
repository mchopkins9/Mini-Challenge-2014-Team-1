/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team2856;

import edu.wpi.first.wpilibj.Jaguar;

/**
 *
 * @author Eric Cao
 */
public class Arm {
    /**PRIVATE MEMBER VARIABLES**/
   private Jaguar jaguar= new Jaguar(RobotVariables.ARM_MC_SLOT, RobotVariables.ARM_MC_CHANNEL);
     
   public Arm(){}
   
   public void move(double speed){
       jaguar.set(speed);
   }
   
   public void stop(){
       jaguar.stopMotor();
   }
   
}
