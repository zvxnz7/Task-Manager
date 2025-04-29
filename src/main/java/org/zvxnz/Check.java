package org.zvxnz;


public class Check {
    private boolean status;

    public Check(boolean status) {
        this.status = status;
    }

    public String getStatus() {
        return status ? "✓" : "×";
    }

    @Override
    public String toString() {
        return "Status: " + getStatus();
    }
}
