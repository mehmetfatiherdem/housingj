package org.example.repository;

import org.example.model.Building;
import org.example.model.House;
import org.example.model.SummerHouse;
import org.example.model.Villa;

import java.util.ArrayList;
import java.util.List;

public class BuildingRepository {
    private List<House> houses;
    private List<Villa> villas;
    private List<SummerHouse> summerHouses;

    private BuildingRepository() {
        houses = List.of(
                new House(100000, 100, 3, 1),
                new House(200000, 200, 5, 2),
                new House(300000, 300, 7, 3)
        );

        villas = List.of(
                new Villa(500000, 500, 10, 5),
                new Villa(600000, 600, 12, 6),
                new Villa(700000, 700, 14, 7)
        );

        summerHouses = List.of(
                new SummerHouse(80000, 80, 2, 1),
                new SummerHouse(90000, 90, 3, 1),
                new SummerHouse(100000, 100, 4, 2)
        );
    }

    public static BuildingRepository getInstance() {
        return new BuildingRepository();
    }

    public List<Building> getBuildings() {
        List<Building> buildings = new ArrayList<>();
        buildings.addAll(houses);
        buildings.addAll(villas);
        buildings.addAll(summerHouses);

        return buildings;
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    public List<Villa> getVillas() {
        return villas;
    }

    public void setVillas(List<Villa> villas) {
        this.villas = villas;
    }

    public List<SummerHouse> getSummerHouses() {
        return summerHouses;
    }

    public void setSummerHouses(List<SummerHouse> summerHouses) {
        this.summerHouses = summerHouses;
    }
}
