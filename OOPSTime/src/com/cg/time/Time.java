//taking input for time and add them and store it 

package com.cg.time;

public class Time {
	private int hours;
	private int minutes;
	private int sum_hours;
	private int sum_minutes;

//getters and setters
	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setTime(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}

	public String showTime() {
		return getHours() + " hours " + +getMinutes() + " minutes";
	}

	public String toString() {
		return sum_hours + " hours " + sum_minutes + " minutes";
	}

//adding two time objects and store them in third 
	public Time sum(Time time_obj1, Time time_obj2) {
		Time time_obj = new Time();
		int hours1 = time_obj1.hours;
		int hours2 = time_obj2.hours;
		int minutes1 = time_obj1.minutes;
		int minutes2 = time_obj2.minutes;
		int sum_hours = 0;
		int sum_minutes = 0;
		time_obj.sum_hours = hours1 + hours2;// adding hours
		time_obj.sum_minutes = minutes1 + minutes2;// adding minutes
		if (time_obj.sum_minutes > 60) { // checks if sum of minutes is greater than 60
			while (time_obj.sum_minutes > 60) {
				int extra_min = time_obj.sum_minutes % 60;
				time_obj.sum_minutes = time_obj.sum_minutes - 60;
				time_obj.sum_hours++;
			}
		}
		return time_obj;
	}
}
