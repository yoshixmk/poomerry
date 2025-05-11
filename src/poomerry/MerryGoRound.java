package poomerry;

import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;

class MerryGoRound {
    public void start() {
	RegulatedMotor m = new EV3LargeRegulatedMotor(MotorPort.A);
	SystemEnd se = new SystemEnd(m);
	Button.ESCAPE.addKeyListener(new SystemEndWatcher(se));
	
	new FowardStrategy(m).execute();
	
	se.execute();
    }
}
