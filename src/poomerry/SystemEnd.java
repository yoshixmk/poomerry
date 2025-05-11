package poomerry;

import lejos.robotics.RegulatedMotor;

public class SystemEnd {
	private RegulatedMotor m;
	public SystemEnd(RegulatedMotor m) {
		this.m = m;
	}
	public void execute() {
		m.close();
		System.exit(0);
	}
}
