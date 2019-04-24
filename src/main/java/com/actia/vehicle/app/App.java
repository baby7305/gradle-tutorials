package com.actia.vehicle.app;

import com.actia.vehicle.entity.Boy;
import com.actia.vehicle.entity.Girl;

public class App {
	public static void main(String[] args) {
		Boy boy = new Boy("tom");
		System.out.println(boy.greeting());
		Girl girl = new Girl("lucy");
		System.out.println(girl.greeting());
	}
}
