package com.example.kairos.pojo;

import java.util.List;

public class DistanceMatrix {

    private List<Integer> locations;

    private List<List<Integer>> distances;

    public DistanceMatrix(List<Integer> locations, List<List<Integer>> distances) {
        this.locations = locations;
        this.distances = distances;
    }

    public List<Integer> getLocations() {
        return locations;
    }

    public void setLocations(List<Integer> locations) {
        this.locations = locations;
    }

    public List<List<Integer>> getDistances() {
        return distances;
    }

    public void setDistances(List<List<Integer>> distances) {
        this.distances = distances;
    }
}
