package de.tum.in.ase.eist;

import java.util.Set;
import java.util.stream.Collectors;

// TODO realize proxy pattern
public class AvailablePEVSearcher implements SearchInterface{

	private Set<PEV> pevs;

	public AvailablePEVSearcher(Set<PEV> availablePEVs) {
		pevs = availablePEVs;
	}

	public Set<PEV> searchPEVs(Rider rider) {
		return pevs.stream().filter(pev -> pev.getChargeLevel() > 0 && pev.isAvailable()).collect(Collectors.toSet());
	}
}
