package poomerry;

import lejos.hardware.Key;
import lejos.hardware.KeyListener;

public class SystemEndWatcher implements KeyListener {
	private SystemEnd se;

	public SystemEndWatcher(SystemEnd se) {
		this.se = se;
	}

	@Override
	public void keyReleased(Key k) {
		// Do nothing
	}

	@Override
	public void keyPressed(Key k) {
		se.execute();
	}
}
