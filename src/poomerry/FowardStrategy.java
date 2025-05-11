package poomerry;

import lejos.hardware.lcd.LCD;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;

public class FowardStrategy {
    private static final int SPEED = 45;
    private RegulatedMotor m;
    
    public FowardStrategy(RegulatedMotor m) {
	this.m = m;
    }
    
    public void execute() {
	m.setSpeed(SPEED);
	m.forward();
	
	LCD.drawString("Rotating for 5 min", 0, 2);
	LCD.drawString("If stopping,", 0, 4);
	LCD.drawString("press left-up btn", 0, 5);
	Delay.msDelay(60 * 1000 * 5);
    }
}
