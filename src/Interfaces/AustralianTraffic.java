package Interfaces;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {

		CentralTraffic ct = new AustralianTraffic();
		ct.RedStop();
		ct.GreenGo();
		ct.YellowWait();
		
		ContinentalTraffic tr = new AustralianTraffic();
		tr.TrafficSystem();
	}

	@Override
	public void RedStop() {
		System.out.println("Implementing Red - STOP");
		
	}

	@Override
	public void GreenGo() {
		System.out.println("Implementing Green - GO");
		
	}

	@Override
	public void YellowWait() {
		System.out.println("Implementing Yellow - WAIT");
		
	}

	@Override
	public void TrafficSystem() {
		System.out.println("Implementing Traffic system");
	}

}
