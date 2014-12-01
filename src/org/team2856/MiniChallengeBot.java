/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.team2856;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class MiniChallengeBot extends IterativeRobot {
    /**PRIVATE MEMBER VARIABLES**/
    private Arm arm;
    private DriveTrain DT;
    private Timer time;
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    //@author Eric Cao
    public void robotInit() {
        arm = new Arm();
        DT = new DriveTrain();
        time = new Timer();
    }

    public void autonomousInit() {
        DT.move(0.2);
        time.start();
    }
    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        if(time.get() >= 2*1000){//2 is how many seconds run
            DT.stop();
            arm.move(0.1);
            if(time.get() >= 3*1000){//3 is how many seconds run
                arm.stop();
            }
        }
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        //Not for this challenge
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        //Not for this challenge
    }
    
}
