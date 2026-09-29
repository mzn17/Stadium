package com.mzn.Stadium;

import java.util.Date; // <--- 1. Add this import
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mzn.Stadium.entities.Stade;
import com.mzn.Stadium.repos.StadeRepository;

@SpringBootTest
class StadiumApplicationTests {

	@Autowired
	private StadeRepository stadeRepository;

	@Test
	public void testCreateStade() {
		Stade stade = new Stade(
				"Stade Olympique de Radès",
				60000,
				new Date());

		stadeRepository.save(stade);
	}

	@Test
	public void testFindStade() {

		Stade s = stadeRepository.findById(1L).get();

		System.out.println(s);
	}

	@Test
	public void testUpdateStade() {

		Stade s = stadeRepository.findById(1L).get();

		s.setCapacite(65000);

		stadeRepository.save(s);
	}

	@Test
	public void testDeleteStade() {

		stadeRepository.deleteById(1L);
	}

	@Test
	public void testListerTousStades() {

		List<Stade> stades = stadeRepository.findAll();

		for (Stade s : stades) {
			System.out.println(s);
		}
	}
}
