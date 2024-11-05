package BT2;

public class Test {
public static void main(String[] args) {
	Vehicle motorcycle = new Motorcycle("Yamaha", 200.0, 0, 0.05, 1.2, 10.0);  // 10 lít nhiên liệu ban đầu
   System.out.println("MOTORCYCLE:");
    motorcycle.displayInfo();
    motorcycle.move(100); 
    motorcycle.refuel(5.0);  // Đổ thêm 5 lít nhiên liệu
    motorcycle.move(50);  // Di chuyển thêm 50 km
    motorcycle.displayInfo();
    System.out.println();
   Vehicle truck = new Truck("Volvo Truck", 500.0, 0, 0.2, 1.5, 50.0, 8000.0);  // 50 lít nhiên liệu ban đầu, trọng lượng xe là 8000 kg
   System.out.println("TRUCK:");
   	truck.displayInfo();
    truck.move(100);  
    truck.refuel(20.0); 
    truck.move(50); 
    truck.displayInfo();
    System.out.println();
    System.out.println("BICYCLE: ");
    Vehicle bicycle = new Bicycle("Giant", 50.0, 100);
    bicycle.displayInfo();
    bicycle.move(20);
    bicycle.displayInfo();
    bicycle.refuel(10); 
}
}
