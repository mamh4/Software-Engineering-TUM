package de.tum.in.ase.eist;


//TODO Task 1.2: Make TemperatureModel observable by implementing Subject<Double>
public class TemperatureModel extends Subject<Double>{

    private double celsiusTemperature;

    public void setF(double tempF) {
        setC(TemperatureConverter.convertFahrenheitToCelsius(tempF));
    }

    public void setC(double tempC) {
        celsiusTemperature = tempC;
        notifyObservers(tempC);
    }

    public void increaseF(double amount) {
        final double currentFahrenheit = TemperatureConverter.convertCelsiusToFahrenheit(celsiusTemperature);
        final double newFahrenheit = currentFahrenheit + amount;

        setC(TemperatureConverter.convertFahrenheitToCelsius(newFahrenheit));
    }

    public void increaseC(double amount) {
        setC(celsiusTemperature + amount);
    }

    //TODO Task 2.2: Add Kelvin-Support by implementing setK() and increaseK()
}
