package com.urdomain.ch07.sec04;

public class SupersonicExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.Normal;
		sa.fly();
		sa.land();
	}
}
