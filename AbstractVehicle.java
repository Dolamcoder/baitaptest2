package BT2;

public abstract class AbstractVehicle implements Vehicle {
private String name;
public double baseMaintenanceCost;// chi phi bao tri co ban
public int mileage;
public AbstractVehicle(String name, double baseMaintenanceCost, int mileage) {
	this.name = name;
	this.baseMaintenanceCost = baseMaintenanceCost;
	this.mileage = mileage;
}
public void move(int distance) {
  this.mileage+=distance;
  System.out.println("So km cua xe sau khi dien chuyen them "+distance+" la "+this.mileage);
}
public void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("Base maintenance cost: " + baseMaintenanceCost);
    System.out.println("Mileage: " + mileage + " km");
}
public abstract double  calculateFuelCost(int distance);
}