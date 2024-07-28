package org.example;

import org.example.repository.BuildingRepository;
import org.example.service.BuildingService;

public class Main {
    public static void main(String[] args) {
        var buildingRepository = BuildingRepository.getInstance();
        var buildingService = new BuildingService(buildingRepository);

        System.out.println("Total house price: " + buildingService.getTotalHousePrice());
        System.out.println("Total summer house price: " + buildingService.getTotalSummerHousePrice());
        System.out.println("Total villa price: " + buildingService.getVillaPrice());
        System.out.println("Total building price: " + buildingService.getAllBuildingPrice());
        System.out.println("Average house area: " + buildingService.getAverageHouseArea());
        System.out.println("Average villa area: " + buildingService.getAverageVillaArea());
        System.out.println("Average summer house area: " + buildingService.getAverageSummerHouseArea());
        System.out.println("Average building area: " + buildingService.getAverageBuildingArea());

        var buildingsWithRoomsAndSaloons = buildingService.getBuildingsWithRoomsAndSaloons(3, 1);
        System.out.println("Buildings with 3 rooms and 1 saloon:");
        buildingsWithRoomsAndSaloons.forEach(System.out::println);

    }
}