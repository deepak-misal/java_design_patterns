package com.techlab.model;

public class MillenniumFalconProxy implements Spaceship{
	private Pilot pilot;
    private Spaceship falcon;
    private String spaceshipPilot= "Han Solo";

    public MillenniumFalconProxy(Pilot pilot) {
        this.pilot = pilot;
        this.falcon = new MillenniumFalcon();
    }

	@Override
	public void fly() {
		if (pilot.getName().equals(spaceshipPilot)) {
            falcon.fly();
        } else {
            System.out.println("Sorry "+pilot.getName()+",only Han Solo can fly the Falcon!\n");
        }
		
	}

}
