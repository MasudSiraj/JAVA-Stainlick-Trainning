package com.ge.domain;

public class Engine {

    private boolean running;

    public String runningStatus(){
        return running ? "Running" : "Not Running";
    }

    public void start(){
        running = !running;
    }

    public void stop(){
        running = !running;
    }

    public boolean isRunning() {
        return running;
    }
}
