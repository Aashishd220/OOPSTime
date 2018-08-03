//class with main function passing values to Time and printing the sum

package com.cg.timetest;

import com.cg.time.Time;

public class TimeTest {

	public static void main(String[] args) {
		Time time_obj1 = new Time();// object creation
		Time time_obj2 = new Time();

		time_obj1.setTime(12, 34);// passing the values
		time_obj2.setTime(1, 54);

		System.out.println(time_obj1.showTime());// printing time
		System.out.println(time_obj2.showTime());

		Time time_obj3 = new Time();
		System.out.println(time_obj3.sum(time_obj1, time_obj2));// printing the sum of two times

	}

}
