package Blatt4;

import at.omi.smarthome.interfaces.Actor;
import at.omi.smarthome.simulation2.SimulatedLight2;

public class AdapterSl2 extends SimulatedLight2 implements Actor {
    @Override
    public void switchOn() {
        set(1);
    }

    @Override
    public void switchOff() {
        set(0);
    }

    @Override
    public void setId(String s) {

    }

    @Override
    public String getId() {
        return null;
    }
}
