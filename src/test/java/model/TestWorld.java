package model;

import org.junit.Test;

public class TestWorld {

	@Test
	public void createWorld() {
		World world = new World(10,10);
	}
	
	@Test
	public void testWorldDimensions() {
		World world = new World(11,12);
		assert(world.getWidth() == 11);
		assert(world.getHeight() == 12);
		
	}
}
