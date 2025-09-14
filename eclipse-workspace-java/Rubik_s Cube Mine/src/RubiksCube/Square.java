package RubiksCube;

import java.awt.Color;

public class Square {
	
	Color top = Color.WHITE, front = new Color(185, 0, 0), right = new Color(0, 69, 173), 
			back = new Color(255, 89, 0), left = new Color(0, 155, 72), bottom = new Color(255, 213, 0), t;
	
	void up() {
		t = front;
		front = bottom;
		bottom = back;
		back = top;
		top = front;
	}
	
	void down() {
		t = front;
		front = top;
		top = back;
		back = bottom;
		bottom = t;
	}
	
	void left() {
		t = front;
		front = right;
		right = back;
		back = left;
		left = t;
	}
	
	void right() {
		t = front;
		front = left;
		left = back;
		back = right;
		right = t;
	}
	
}
