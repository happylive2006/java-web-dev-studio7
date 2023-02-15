package org.launchcode.studio7;

public abstract class ComputerDisc extends BassDisc {

    private boolean isInserted = false;
    public ComputerDisc(int storageCapacity, int spinSpeed) {
        super(storageCapacity, spinSpeed);
    }

    public ComputerDisc(int storageCapacity, int spinSpeed, String title) {
        super(storageCapacity, spinSpeed, title);
        this.isInserted = false;
    }

    public boolean isInserted() {return this.isInserted;}

    public void insert() {
        this.isInserted = true;
    }
}
