package de.tum.in.ase.eist;

import java.util.HashSet;
import java.util.Set;

public class PEVScanner {

	private SearchInterface searchInterface;
	Set<PEV> availablePEVs = new HashSet<>();

	public PEVScanner(Set<PEV> availablePEVs) {
		this.availablePEVs = availablePEVs;
	}

	public Set<PEV> searchPEVs(Rider rider) {
		Set<PEV> result = new HashSet<>();
		PermissionChecker permissionChecker = new PermissionChecker();
		for(PEV pev:availablePEVs){
			if(permissionChecker.isPermitted(rider,pev)){
				result.add(pev);
			}
		}
		AvailablePEVSearcher a = new AvailablePEVSearcher(result);
		return a.searchPEVs(rider);
	}

}
