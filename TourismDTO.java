package com.xworkz.groups;

public class TourismDTO {
    private String place;
    private double costEstimatePerHead;
    private boolean ambience;
    private TypesTourism type;
    private String famousFood;
    
    TourismDTO(){
    	
    }
	
		
	public TourismDTO(String place, double costEstimatePerHead, boolean ambience, TypesTourism type,
			String famousFood) {
		super();
		this.place = place;
		this.costEstimatePerHead = costEstimatePerHead;
		this.ambience = ambience;
		this.type = type;
		this.famousFood = famousFood;
	}
	@Override
	public String toString() {
		return "TourismDTO [place=" + place + ", costEstimatePerHead=" + costEstimatePerHead + ", ambience=" + ambience
				+ ", type=" + type + ", famousFood=" + famousFood + "]";
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public double getCostEstimatePerHead() {
		return costEstimatePerHead;
	}
	public void setCostEstimatePerHead(double costEstimatePerHead) {
		this.costEstimatePerHead = costEstimatePerHead;
	}
	public boolean isAmbience() {
		return ambience;
	}
	public void setAmbience(boolean ambience) {
		this.ambience = ambience;
	}
	public TypesTourism getType() {
		return type;
	}
	public void setType(TypesTourism type) {
		this.type = type;
	}
	public String getFamousFood() {
		return famousFood;
	}
	public void setFamousFood(String famousFood) {
		this.famousFood = famousFood;
	}
    
    
}
