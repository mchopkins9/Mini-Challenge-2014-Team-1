package org.team2856;

/**
 * Class that contains all constants relevant to peripherals mapping and overall
 * robot function.
 * @author Morgan
 */
public class RobotVariables {
    
    //DriveTrain
    public static final int DT_MC_SLOT = 1,//slot for motor control
            DT_MC_CHANNEL_LEFT = 1,//channel for left motor control
            DT_MC_CHANNEL_RIGHT = 2;//channel for right motor control
    
    //arm
    public static final int ARM_SOL_SLOT = 1,//slot for solenoid
            ARM_SOL_CHANNEL_A = 1,//first channel for solenoid
            ARM_SOL_CHANNEL_B = 2;//seccond channel for solenoid
    
}