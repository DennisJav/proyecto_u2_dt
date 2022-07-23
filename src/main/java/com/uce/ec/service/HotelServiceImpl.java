package com.uce.ec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ec.modelo.onetomany.Habitacion;
import com.uce.ec.modelo.onetomany.Hotel;
import com.uce.ec.repository.IHabitacionRepo;
import com.uce.ec.repository.IHotelRepo;

@Service
public class HotelServiceImpl implements IHotelService{

	@Autowired
	private IHotelRepo iHotelRepo;

//	@Autowired
//	private IHabitacionRepo habitacionRepo;
	
	@Override
	public void crearHotel(Hotel hotel) {
		// TODO Auto-generated method stub
//		List<Habitacion> //habitaciones=hotel.getHabitaciones();
//		hotel.setHabitaciones(null);
		
		this.iHotelRepo.crearHotel(hotel);
		
		
		//--------------------------------------------------
		
//		String numero=hotel.getNombre();
//		Hotel hotelBuscado=null;
//		for(Habitacion habiItem: habitaciones) {
//			//Calculos <--- cuando se hace calculos no sirve el cascade 
//			habiItem.setHotel(hotelBuscado);
//			this.habitacionRepo.crearHabitacion(habiItem);
//		}
	}
	
	
	
}
