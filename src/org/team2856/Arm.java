/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team2856;

import edu.wpi.first.wpilibj.Solenoid;

/**
 *
 * @author Eric Cao
 */
public class Arm {
    /**PRIVATE MEMBER VARIABLES**/
    private Solenoid extend = new Solenoid(RobotVariables.ARM_SOL_SLOT, RobotVariables.ARM_SOL_CHANNEL_A);
    private Solenoid retract = new Solenoid(RobotVariables.ARM_SOL_SLOT, RobotVariables.ARM_SOL_CHANNEL_A);
    private boolean extended = false;
    
    /****/
    public void toggle(){
        if(extended == false){
            extend.set(true);
            retract.set(false);
        }else{
           extend.set(false);
           retract.set(true); 
        }
        extended = !extended;
    }
    
    
}
