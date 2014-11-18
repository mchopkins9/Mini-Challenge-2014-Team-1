/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team2856;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 *
 * @author Jan
 */
public class DriveTrain {
    private Jaguar left = new Jaguar(RobotVariables.DT_MC_SLOT, RobotVariables.DT_MC_CHANNEL_LEFT);
    private Jaguar right = new Jaguar(RobotVariables.DT_MC_SLOT, RobotVariables.DT_MC_CHANNEL_RIGHT);
    
    private RobotDrive RD = new RobotDrive(left, right);
    
    //author Jan
    public void move(double spd){
        RD.tankDrive(spd, spd);
    }
    
    public void stop(){
        RD.tankDrive(0,0);
    }
}
