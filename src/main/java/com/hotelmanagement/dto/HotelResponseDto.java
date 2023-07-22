package com.hotelmanagement.dto;

import com.hotelmanagement.entity.Hotel;
import lombok.Data;

@Data
public class HotelResponseDto extends CommanApiResponse {
	
	private Hotel hotel;

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

}
