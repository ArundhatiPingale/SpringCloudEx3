package com.example.exspringcloud.controller;

public class Limits {
	
	private int minLimits;
	private int maxLimits;
	
	
	public Limits() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Limits(int minLimits, int maxLimits) {
		super();
		this.minLimits = minLimits;
		this.maxLimits = maxLimits;
	}
	public int getMinLimits() {
		return minLimits;
	}
	public void setMinLimits(int minLimits) {
		this.minLimits = minLimits;
	}
	public int getMaxLimits() {
		return maxLimits;
	}
	public void setMaxLimits(int maxLimits) {
		this.maxLimits = maxLimits;
	}
	
	

}
