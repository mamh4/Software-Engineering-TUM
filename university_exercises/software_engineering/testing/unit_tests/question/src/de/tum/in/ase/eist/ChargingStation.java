package de.tum.in.ase.eist;

public class ChargingStation {

	private PEV[] chargingSpots;
	private PowerDelivery powerDelivery;

	public ChargingStation() {
		chargingSpots = new PEV[42];
	}

	public PEV[] getChargingSpots() {
		return chargingSpots;
	}

	public void connectPowerDelivery(PowerDelivery powerDelivery) {
		this.powerDelivery = powerDelivery;
	}

	public boolean addPEV(PEV newPEV) {
		for (int i = 0; i < chargingSpots.length; i++) {
			if (chargingSpots[i] == null) {
				chargingSpots[i] = newPEV;
				return true;
			}
		}

		return false;
	}

	/**
	 * Charges up connected PEVs by 1 unit.
	 *
	 * @throws LowPowerException if the needed power is <b>at least equal</b> to the
	 *                           used power
	 */
	public void chargePEVs() {
		int usedPower = 0;
		int maxPower = powerDelivery.getPowerOutput();
		for (int i = 0; i < chargingSpots.length; i++) {
			if (chargingSpots[i] != null) {
				usedPower += 1;
				chargingSpots[i].chargeUp();

				if (chargingSpots[i].getChargeLevel() == 100) {
					chargingSpots[i] = null;
				}
			}

			if (usedPower == maxPower) {
				throw new LowPowerException("The power output is not enough. We need more connections!");
			}
		}
	}
}
