package BT2;

public class Bicycle extends AbstractVehicle{
private int CPSC=5;
//chi phi sua chua;
	public Bicycle(String name, double baseMaintenanceCost, int mileage) {
		super(name,baseMaintenanceCost,mileage );
	}

	@Override
	public double calculateFuelCost(int distance) {
		return 0;
		// xe dap khong co nhien lieu
	}
	public void move(int distance) {
		super.move(distance);
	}
	public double calculateMaintenanceCost() {
		return this.baseMaintenanceCost+this.CPSC;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Bicycle";
	}
	public void refuel(double amount) {
		System.out.println("Toi di xe dap chi can Nguoi yeu khong can nhien lieu.");
		
	}
}
