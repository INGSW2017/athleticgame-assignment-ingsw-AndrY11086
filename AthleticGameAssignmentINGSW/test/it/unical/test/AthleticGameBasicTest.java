package it.unical.test;

import java.time.Instant;

import org.junit.Assert;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {

	@Test
	public void addArrival(){
		AthleticGame ag = new AthleticGame("sport");
		ag.addArrival("partecipante", Instant.now());
		Assert.assertEquals(1,ag.getArrivals().size());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getPartecipantTime(){
		AthleticGame ag = new AthleticGame("sport");
		
		ag.getParecipiantTime("");
	}
	
}
