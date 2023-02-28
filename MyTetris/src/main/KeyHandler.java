package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	public boolean upPressed, downPressed, leftPressed, rightPressed;

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int code = e.getKeyCode();

		if (code == KeyEvent.VK_W) {
			upPressed = true;
			leftPressed = false;
			downPressed = false;
			rightPressed = false;
		}
		if (code == KeyEvent.VK_A) {
			upPressed = false;
			leftPressed = true;
			downPressed = false;
			rightPressed = false;

		}
		if (code == KeyEvent.VK_S) {
			upPressed = false;
			leftPressed = false;
			downPressed = true;
			rightPressed = false;

		}
		if (code == KeyEvent.VK_D) {
			upPressed = false;
			leftPressed = false;
			downPressed = false;
			rightPressed = true;

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int code = e.getKeyCode();

		if (code == KeyEvent.VK_W) {
			upPressed = false;
			
		}
		if (code == KeyEvent.VK_A) {
			leftPressed = false;

		}
		if (code == KeyEvent.VK_S) {
			downPressed = false;

		}
		if (code == KeyEvent.VK_D) {
			rightPressed = false;

		}

	}

}
