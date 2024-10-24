package org.launchcode;

public abstract class AbstractEntity {
    private static int nextId = 1;

    public AbstractEntity() {
        nextId = nextId;
    }

    public void setNextId(int nextId) {
        this.nextId = nextId;
    }

    public int getNextId() {
        return nextId++;
    }
}
