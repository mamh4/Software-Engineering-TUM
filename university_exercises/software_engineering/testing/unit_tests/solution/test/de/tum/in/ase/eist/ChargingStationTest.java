package de.tum.in.ase.eist;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.jupiter.api.Assertions.*;

import java.time.*;
import java.util.*;

import org.easymock.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(EasyMockExtension.class)
class ChargingStationTest {

	// TODO make sure to specify the necessary elements for the mock object pattern

	// TODO implement the 2 tests here
    @Mock
    private PowerDelivery powerDelivery;

    @TestSubject
    private ChargingStation chargingStation = new ChargingStation();

    @Test
    public void testPowerDelivery(){
        PEV emoped = new EMoped(25,"123");
        chargingStation.addPEV(emoped);
        expect(powerDelivery.getPowerOutput()).andReturn(1);
        replay(powerDelivery);
        int expected = emoped.getChargeLevel()+1;
        chargingStation.chargePEVs();
        assertEquals(expected,emoped.getChargeLevel());
    }

    @Test
    public void testPowerDelivery2(){
        PEV emoped = new EMoped(25,"123");
        chargingStation.addPEV(emoped);
        expect(powerDelivery.getPowerOutput()).andReturn(1);
        replay(powerDelivery);
        int expected = emoped.getChargeLevel()+1;
        assertThrows(LowPowerException.class,()->{chargingStation.chargePEVs();});
    }

}