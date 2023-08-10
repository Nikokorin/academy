package airplanecompany;

public class Main {

	public static void main(String[] args) {

		Aircraft aircraftAirbusC455 = new AircraftAirbusC455();
		Aircraft aircraftKais = new AircraftKais();
		Aircraft aircraftNiks = new AircraftNiks();

		Airline UkInternationalAirline = new Airline("Uk International Airlines");
		UkInternationalAirline.addAircraft(aircraftAirbusC455);
		UkInternationalAirline.addAircraft(aircraftKais);
		UkInternationalAirline.addAircraft(aircraftNiks);

		UkInternationalAirline.showAirlineAircrafts();

		System.out.println("Aircrafts sorted by flight range:");
		UkInternationalAirline.sortPlanesByFlightRange();
		UkInternationalAirline.showAirlineAircrafts();
		System.out.println();

		UkInternationalAirline.filterAircraftsByFuelConsumption(2000, 3000, true);
		System.out.println();

		UkInternationalAirline.calculateTotalCargoPassengerCapacity();

	}

}
