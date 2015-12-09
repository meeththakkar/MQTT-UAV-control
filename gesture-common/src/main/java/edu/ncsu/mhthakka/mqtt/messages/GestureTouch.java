package edu.ncsu.mhthakka.mqtt.messages;

public class GestureTouch {

	/**
	 * number of touches
	 */
	public int touches;
	
	/**
	 * relative horizontal position of touch in range of 0 to 1;
	 */
	public float x;
	
	/**
	 * relative vertical position of touch in range of 0 to 1;
	 */
	public float y;
	
	/**
	 * incremental gesture number ( will increase by 1 for each new swipe.
	 */
	public int gestureNumber;
	
	
	/**
	 * incremental touch number ( will increase by 1 for each new sample of touch, initializes to 0 for each new gesture )
	 */
	public int touchNumber;
	
	/**
	 * starts from 0 for each gestureNumber.
	 */
	public long milliseconds;
	
	
	/*public enum TYPE {
		TWO_FINGURE_UP,
		TWO_FINGURE_DOWN,
		ONE_FINGURE_UP,
		ONE_FINGURE_DOWN,
		ONE_FINGURE_LEFT,
		ONE_FINGURE_RIGHT
	}*/
}
