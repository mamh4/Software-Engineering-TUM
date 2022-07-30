package de.tum.in.ase.eist;

import static org.junit.jupiter.api.Assertions.*;

import java.time.*;
import java.util.*;

import org.junit.jupiter.api.*;

class RentalTest {

	/*
     * @formatter:off
     *
     * Helpful methods from java.time:
     *
     * Creating new LocalDateTime objects:
     * - LocalDateTime.now()
     * - LocalDateTime.of(year, month, day, hour, minute)
     * - someDateTime.plusYears(years)
     * - someDateTime.plusSeconds(seconds)
     *
     * Getting the time span between two dates:
     * - Duration.between(from, to).getSeconds()
     *
     * Comparing two LocalDateTime objects
     * - dateTimeOne.isBefore(dateTimeTwo)
     * - dateTimeOne.isAfter(dateTimeTwo)
     *
     * @formatter:on
     */

	// TODO implement the 3 tests here
    @Test
    public void testRental(){
        LocalDateTime l_from = LocalDateTime.of(2021,11,11,11,11);
        LocalDateTime l_to = LocalDateTime.of(2021,11,11,11,50);
        LocalDateTime l_valid = LocalDateTime.of(2028,11,11,11,50);
        PEV emoped = new EMoped(25,"123");
        Rider rider = new Rider("Jim",21,true,new DriversLicense(l_valid,"Jim"));
        assertThrows(IllegalArgumentException.class,()->{Rental rental = new Rental(l_to,l_from,emoped,rider);});//switched to and from

    }
    @Test
    public void testRental2(){
        LocalDateTime l_from = LocalDateTime.of(2021,11,11,11,11);
        LocalDateTime l_to = LocalDateTime.of(2021,11,11,11,11,58);
        LocalDateTime l_valid = LocalDateTime.of(2028,11,11,11,50);
        PEV emoped = new EMoped(25,"123");
        Rider rider = new Rider("Jim",21,true,new DriversLicense(l_valid,"Jim"));
        Rental rental = new Rental(l_from,l_to,emoped,rider);
        assertThrows(IllegalStateException.class,()->{rental.start();});//switched to and from

    }
    @Test
    public void testRental3(){
        LocalDateTime l_from = LocalDateTime.of(2021,11,11,11,11);
        LocalDateTime l_to = LocalDateTime.of(2021,11,11,11,50);
        LocalDateTime l_valid = LocalDateTime.of(2028,11,11,11,50);
        PEV emoped = new EMoped(25,"123");
        Rider rider = new Rider("Jim",21,true,new DriversLicense(l_valid,"Jim"));
        Rental rental = new Rental(l_from,l_to,emoped,rider);
        assertThrows(IllegalStateException.class,()->{rental.stop();});//switched to and from

    }


}