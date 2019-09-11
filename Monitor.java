package com.pranita.practice;

public class Monitor {
	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeresolution;// Monitor has resolution ===> composition
	
	public Monitor(String model, String manufacturer, int size, Resolution nativeresolution) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeresolution = nativeresolution;
	}
	
	public void drawPixcelAt(int x, int y, String color) {
		System.out.println("Drawing pixcel at: "+x +" , "+y+" in color "+color);
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Resolution getNativeresolution() {
		return nativeresolution;
	}

	public void setNativeresolution(Resolution nativeresolution) {
		this.nativeresolution = nativeresolution;
	}
	
	
	
	
}
