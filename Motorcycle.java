package BT2;

public class Motorcycle extends AbstractVehicle {
	private double fuelEfficiency;  // Lượng nhiên liệu tiêu thụ mỗi km (lít/km)
    private double fuelCostPerLiter;  // Chi phí nhiên liệu mỗi lít (USD)
    private double  fuel; // muc nhien lieu con lai trong xe
	public Motorcycle(String name, double baseMaintenanceCost, int mileage,double fuelEfficiency,double fuelCostPerLiter, double  fuel) {
		super(name,baseMaintenanceCost,mileage);
		this.fuelCostPerLiter=fuelCostPerLiter;
		this.fuelEfficiency=fuelEfficiency;
		this.fuel=fuel;
	}
	public double calculateFuelCost(int distance) {
		return this.fuelCostPerLiter*this.fuelEfficiency*distance;
	}
	public void refuel(double amount) {
        this.fuel += amount;
        System.out.println("Mức nhiên liệu sau khi đổ thêm là: " + this.fuel + " lít.");
    }
	public void move(int distance) {
		double nguyenlieudu=distance*this.fuelEfficiency;
		if(this.fuel>=nguyenlieudu) {
			System.out.println(nguyenlieudu);
			System.out.println("Da du nhien lieu xe co the khoi hanh ");
			this.fuel -= nguyenlieudu;
			super.move(distance);
		}
		else {
			double nguyenlieuthieu=nguyenlieudu-this.fuel;
			System.out.println("nguyen lieu khong du hay nap the luong "+nguyenlieuthieu+" nhien lieu");
		}
	}
	public void displayInfo() {
        super.displayInfo();
        System.out.println("Hieu xuat nhien lieu: " + fuelEfficiency + " liters/km");
        System.out.println("Gia nhien lieu: " + fuelCostPerLiter + " USD");
        System.out.println("Nhien lieu con lai: " + fuel + " liters");
	}
	public String getType() {
		return "Motorcycle";
	}
	public double calculateMaintenanceCost() {
		return this.baseMaintenanceCost+calculateFuelCost(this.mileage);
	}
}
