package com.anonymus;

import java.util.function.Function;

class SensorData{
	private double temperature;
	private double humidity;
	
	public SensorData(double temperature, double humidity) {
		this.temperature = temperature;
		this.humidity = humidity;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public double getTemperature() {
		return temperature;
	}

	public double getHumidity() {
		return humidity;
	}

}


public class Question2 {

	public static void main(String[] args) {
		SensorData sd= new SensorData(40.5, 65.0);
		
		Function<SensorData,Double> fd = new Function<SensorData,Double>(){
			@Override
			public Double apply(SensorData sd) {
				return sd.getTemperature();
				
			}
		};
		System.out.println("Temperature: "+fd.apply(sd));
		
		double threshoid=25.0;
		Function<Double, Boolean> fb=new Function<Double, Boolean>() {
			
			@Override
			public Boolean apply(Double temperature) {
				return temperature>threshoid;
			}
		};
		System.out.println("Temperature is above "+threshoid+" : "+fb.apply(36.7));

		
	}

}
