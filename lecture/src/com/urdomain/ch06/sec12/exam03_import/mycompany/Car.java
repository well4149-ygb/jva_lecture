package com.urdomain.ch06.sec12.exam03_import.mycompany;

import com.urdomain.ch06.sec12.exam03_import.hankook.SnowTire;
import com.urdomain.ch06.sec12.exam03_import.hyndai.Engine;
import com.urdomain.ch06.sec12.exam03_import.kumho.BigWidthTire;

public class Car {
		//ÇÊµå
		Engine engine = new Engine();
		SnowTire tire1 = new SnowTire();
		BigWidthTire tire2 = new BigWidthTire();
		
		com.urdomain.ch06.sec12.exam03_import.hankook.Tire tire3 = new com.urdomain.ch06.sec12.exam03_import.hankook.Tire();
		com.urdomain.ch06.sec12.exam03_import.kumho.Tire tire4 = new com.urdomain.ch06.sec12.exam03_import.kumho.Tire();
}
