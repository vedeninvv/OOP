package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class AirRace implements Race{
    private double distance;
    private ArrayList<Transport> members = new ArrayList<>();

    public AirRace(double distance){
        setDistance(distance);
    }

    public AirRace(){}

    public void register(AirTransport... members){
        this.members.addAll(Arrays.asList(members));
    }

    @Override
    public ArrayList<Transport> getMembers() {
        return members;
    }

    @Override
    public double getDistance() {
        return distance;
    }

    @Override
    public void setDistance(double distance) throws IllegalArgumentException{
        if (distance <= 0) throw new IllegalArgumentException("Distance is not positive");
        this.distance = distance;
    }
}
