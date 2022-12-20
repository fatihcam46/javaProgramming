package day54_2_boot_camp.abstraction_review;

public class Tesla extends Car implements AutoPilot {
    @Override
    public void driver() {    }
    @Override
    public void start() {    }

    @Override
    public void stop() {    }

    @Override
    public void auto_pilot() {    }   //it has extra this method, but some things has also this method,so that we need interface
}