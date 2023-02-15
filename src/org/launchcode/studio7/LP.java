package org.launchcode.studio7;

public class LP extends BassDisc implements OpticalDisc {
    public LP(int storageCapacity, int spinSpeed) {
        super(storageCapacity, spinSpeed);
    }

    @Override
    public void spinDisc() {


    }

    @Override
    public void storeData(String data) {

    }

    @Override
    public boolean isFull() {
        return false;
    }
}
