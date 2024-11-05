package BT2;

public class Truck extends AbstractVehicle {
	private double baseFuelEfficiency; // hieu qua nhien  lieu co ban
    private double fuelCostPerLiter;  // Chi phí nhiên liệu mỗi lít (USD)
    private double   fuel; // muc nhien lieu con lai trong xe
    private double weight; // trong luong xe bao gom hang hoa+chiec xe to cha ba
	public Truck(String name, double baseMaintenanceCost, int mileage, double baseFuelEfficiency, double fuelCostPerLiter, double fuel, double weight) {
		super(name,baseMaintenanceCost,mileage);
		this.fuelCostPerLiter=fuelCostPerLiter;
		this.baseFuelEfficiency=baseFuelEfficiency;
		this.fuel=fuel;
		this.weight=weight;
	}
	public double calculateFuelCost(int distance) {
        // Tính hiệu suất nhiên liệu điều chỉnh theo trọng lượng của xe
        double weightFactor = 0.0015;  // Tỷ lệ tăng mức tiêu thụ nhiên liệu theo trọng lượng (1.5% mỗi tấn)
        
        // Tính hiệu suất nhiên liệu điều chỉnh theo trọng lượng
        double fuelEfficiencyAdjusted = baseFuelEfficiency * (1 + weightFactor * (weight / 1000)); 
        
        // Tính chi phí nhiên liệu cho quãng đường di chuyển
        return distance * fuelEfficiencyAdjusted * fuelCostPerLiter;
    }
	public void refuel(double amount) {
		this.fuel+=amount;
		System.out.println("Muc nhien lieu sau khi duoc nap la: "+this.fuel);
	}
	public void move(int distance) {
		double nguyenlieudu = distance * baseFuelEfficiency * (1 + 0.0015 * (weight / 1000));
		if(this.fuel>=nguyenlieudu) {
			System.out.println("Da du nhien lieu xe co the khoi hanh. ");
			this.fuel-=nguyenlieudu;
			super.move(distance);
		}
		else {
			double nguyenlieuthieu=nguyenlieudu-this.fuel;
			System.out.println("nguyen lieu khong du hay nap the luong "+nguyenlieuthieu+" nhien lieu");
		}
	}
	@Override
	public String getType() {
	    return "Truck";
	}
	public double calculateMaintenanceCost() {
		return this.baseFuelEfficiency+calculateFuelCost(this.mileage);
	}
	public void displayInfo() {
	super.displayInfo(); // Hiển thị thông tin của lớp cha (tên xe, chi phí bảo trì, mileage)
    System.out.println("Hiệu suất nhiên liệu cơ bản: " + baseFuelEfficiency + " liters/km");
    System.out.println("Chi phí nhiên liệu: " + fuelCostPerLiter + " USD/lít");
    System.out.println("Mức nhiên liệu còn lại: " + fuel + " lít");
    System.out.println("Trọng lượng xe: " + weight + " kg");
	}
}
