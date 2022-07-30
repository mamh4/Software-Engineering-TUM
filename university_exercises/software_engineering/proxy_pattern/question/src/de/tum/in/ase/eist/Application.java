package de.tum.in.ase.eist;

import java.time.LocalDateTime;
import java.util.Set;

public class Application {

	// This class can be used for testing, not exhaustive, not sure if this will
	// make its way to the template
	public static void main(String[] args) {

		// Initializing a Rider that will look up their available PEVs
		Rider rider = new Rider("Sebastian", 20, true,
				new DriversLicense(LocalDateTime.now().plusYears(8), "Sebastian"));

		// Initializing a Set of PEVs that are registered in the system
		Set<PEV> availablePEVs = Set.of(new EMoped(0, "SB-GR-1706"), new EKickscooter(10, "RT-AC-3003"),
				new EBike(100, "M-MV-1805"), new EMoped(57, "HN-SE-2212"), new EKickscooter(1, "H-LW-2310"));

		// Initializing the PEV Scanner with all PEVs that are registered in the system
		PEVScanner scanner = new PEVScanner(availablePEVs);

		// Set the rider's PEV Scanner
		rider.setPevScanner(scanner);

		// Look up all PEVs that can be used by the specified rider
		rider.displayRentablePEVs();

	}
}
