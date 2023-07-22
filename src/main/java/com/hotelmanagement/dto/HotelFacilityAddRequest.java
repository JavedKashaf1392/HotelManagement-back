package com.hotelmanagement.dto;

import lombok.Data;

@Data
public class HotelFacilityAddRequest {
	
	private int hotelId;
	
	private int facilityId;

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public int getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	} 
	
}
