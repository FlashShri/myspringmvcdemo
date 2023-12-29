package com.cdac.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.entity.Passenger;
import com.cdac.entity.Passenger.Gender;
import com.cdac.entity.Passenger.Status;
import com.cdac.entity.Pnr;

//assume we are working for IRCTC

@RestController
@CrossOrigin
public class PnrRestController {
	
	@GetMapping("/pnr-status")
	public Pnr checkStatus( @RequestParam int pnrNo) {
		Pnr pnr = new Pnr();
		pnr.setPnrNo(pnrNo);
		pnr.setTrainNo(2323);
		pnr.setTravelDate(LocalDate.of(2023, 12, 12));
		
		List<Passenger>  passengers = new ArrayList<Passenger>();
		

		Passenger p1 =  new Passenger();
		p1.setName("elon");
		p1.setGender(Gender.MALE);
		p1.setStatus(Status.CONFIRMED);
		
		Passenger p2 =  new Passenger();
		p2.setName("mark");
		p2.setGender(Gender.MALE);
		p2.setStatus(Status.CONFIRMED);
		
		passengers.add(p1);
		passengers.add(p2);
		pnr.setPassengers(passengers);
		
		return pnr;

	}
	
}
