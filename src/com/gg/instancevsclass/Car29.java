package com.gg.instancevsclass;

public class Car29 {
    private String company;
    private String model;
    private int productionYear;
    private SteeringWheel29 steeringWheel29;
    static long statiNumberOfCarsCreated;
    long numberOfCarsCreated;

    public Car29() {
        this.company = "BMW";
        this.model = "X5";
        this.productionYear = 2020;
        this.steeringWheel29 = new SteeringWheel29(0.35);
        horn();
        statiNumberOfCarsCreated++;
        numberOfCarsCreated++;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public SteeringWheel29 getSteeringWheel29() {
        return steeringWheel29;
    }

    @Override
    public String toString() {
        return "Car29{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }

    public void horn() {
        int i = 5;
        System.out.println(company + " " + model + " " + productionYear + " horn" +
                "!".repeat(i));
    }
}
