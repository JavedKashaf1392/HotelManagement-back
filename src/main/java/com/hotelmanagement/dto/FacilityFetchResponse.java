package com.hotelmanagement.dto;

import java.util.Set;

import com.hotelmanagement.entity.Facility;

import lombok.Data;

@Data
public class FacilityFetchResponse extends CommanApiResponse { 
	
	private Set<Facility> facilities;

	public Set<Facility> getFacilities() {
		return facilities;
	}

	public void setFacilities(Set<Facility> facilities) {
		this.facilities = facilities;
	}

}
