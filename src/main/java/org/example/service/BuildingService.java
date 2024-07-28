package org.example.service;

import org.example.model.Building;
import org.example.repository.BuildingRepository;

import java.util.List;
import java.util.stream.Collectors;

public class BuildingService {
    private final BuildingRepository buildingRepository;

    public BuildingService(BuildingRepository buildingRepository) {
        this.buildingRepository = buildingRepository;
    }

    public double getTotalHousePrice() {
        return buildingRepository.getHouses().stream().mapToDouble(house -> house.getPrice()).sum();
    }

    public double getTotalSummerHousePrice() {
        return buildingRepository.getSummerHouses().stream().mapToDouble(summerHouse -> summerHouse.getPrice()).sum();
    }

    public double getVillaPrice() {
        return buildingRepository.getVillas().stream().mapToDouble(villa -> villa.getPrice()).sum();
    }

    public double getAllBuildingPrice() {
        return buildingRepository.getBuildings().stream().mapToDouble(building -> building.getPrice()).sum();
    }

    public double getAverageHouseArea() {
        return buildingRepository.getHouses().stream()
                .mapToDouble(house -> house.getArea())
                .average()
                .orElse(0);
    }

    public double getAverageVillaArea() {
        return buildingRepository.getVillas().stream()
                .mapToDouble(villa -> villa.getArea())
                .average()
                .orElse(0);
    }

    public double getAverageSummerHouseArea() {
        return buildingRepository.getSummerHouses().stream()
                .mapToDouble(summerHouse -> summerHouse.getArea())
                .average()
                .orElse(0);
    }

    public double getAverageBuildingArea() {
        return buildingRepository.getBuildings().stream()
                .mapToDouble(building -> building.getArea())
                .average()
                .orElse(0);
    }

    public List<Building> getBuildingsWithRoomsAndSaloons(int rooms, int saloons) {
        return buildingRepository.getBuildings().stream()
                .filter(building -> building.getRooms() == rooms && building.getSaloons() == saloons)
                .collect(Collectors.toList());
    }
}
