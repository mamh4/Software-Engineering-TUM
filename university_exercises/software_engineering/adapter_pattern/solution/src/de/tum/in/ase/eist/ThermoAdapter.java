package de.tum.in.ase.eist;

public class ThermoAdapter implements ThermoInterface{
    @Override

    public double getTempC() {
       FahrenheitThermo fahrenheitThermo = new FahrenheitThermo();
       //(tempF - 32.0) * 5.0 / 9.0
       return (fahrenheitThermo.getFahrenheitTemperature()-32.0)*5.0 /9.0;
    }
}
