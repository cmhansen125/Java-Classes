import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class ZooTest {

	@Test
	public void testAddAnimal() throws IOException {
		LandAnimals la = new LandAnimals("giraffe", "testC", "testG", "testo", "testg", "testF", 10, 20, "africa", "facts", "fine", 1);
		String returnString = la.toString();
		
		assertEquals("Animal: giraffe testC testG testo testF is 10meters tall and 20 kilograms. You can find them in africa. facts Their tag number is 1.", returnString);
	}
	
	@Test
	public void testUpdateAnimal() throws IOException {
		WaterAnimals wa = new WaterAnimals("Whale", "testC", "testG", "testo", "testg", "testF", 10, 20, "africa", "facts", "fine", 2);
		wa.setTagNumber(3);
		wa.update();
		String returnString = wa.toString();
		assertEquals("Whale testC testG testo testF 10 20 africa facts Tag number: 3", returnString);
	}
	@Test
	public void testAddMap() throws IOException {
		Exhibit<Integer, Animal> africa = new Exhibit<Integer, Animal>();
		Exhibit<Integer, Animal> aviary = new Exhibit<Integer, Animal>();
		Exhibit<Integer, Animal> noAmerica = new Exhibit<Integer, Animal>();
		LandAnimals la = new LandAnimals("giraffe", "testC", "testG", "testo", "testg", "testF", 10, 20, "africa", "facts", "fine", 1);
		WaterAnimals wa = new WaterAnimals("Whale", "testC", "testG", "testo", "testg", "testF", 10, 20, "africa", "facts", "fine", 2);
		AirAnimals aa = new AirAnimals("sparrow", "testC", "testG", "testo", "testg", "testF", 10, 20, "africa", "facts", "fine", 3);
		africa.put(la.getTagNumber(), la);
		africa.put(wa.getTagNumber(), wa);
		africa.put(aa.getTagNumber(), aa);
		africa.writeToFile("Africa");
		aviary.writeToFile("Aviary");
		noAmerica.writeToFile("North America");
		String returnString = africa.toString();
		assertEquals(" ", returnString);
	}
	
	@Test
	public void testGetAnimalByName() throws IOException {
		Exhibit<Integer, Animal> africa = new Exhibit<Integer, Animal>();
		LandAnimals la = new LandAnimals("giraffe", "testC", "testG", "testo", "testg", "testF", 10, 20, "africa", "facts", "fine", 1);
		WaterAnimals wa = new WaterAnimals("Whale", "testC", "testG", "testo", "testg", "testF", 10, 20, "africa", "facts", "fine", 2);
		africa.put(la.getTagNumber(), la);
		africa.put(wa.getTagNumber(), wa);
		String returnString = africa.getAnimalByName("whale").toString();
		assertEquals(" ", returnString);
		
	}

}
