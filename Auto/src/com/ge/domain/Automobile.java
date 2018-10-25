package com.ge.domain;

import com.ge.domain.Engine;

public class Automobile {

    private Engine engine;
    private Make make;

    Automobile(Engine engine){
        this.engine = engine;
    }

    Automobile(Engine engine, Make make){
        this.engine = engine;
        this.make = make;
    }

    void pressStartStopButton(){
        if (engine.isRunning())
            engine.stop();
        else
            engine.start();
    }

    @Override
    public String toString() {
        return "Automobile " + engine.runningStatus();
    }
}
