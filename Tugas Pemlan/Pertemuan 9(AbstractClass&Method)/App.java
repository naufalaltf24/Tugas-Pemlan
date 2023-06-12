public class App {
  public static void main(String[] args) {
    // todo...
    Owner owner1 = new Owner("Naufal");
    Car car1 = new Car(owner1, "Aston Martin db11", 2022, 6500.0);
    car1.data();
    Owner owner2 = new Owner("Natasya");
    Car car2 = new Car(owner2, "Aston Martin Valkrie", 2017, 6500.0);
    car2.data();
    Owner owner3 = new Owner("Ammar");
    Car car3 = new Car(owner3, "Maserati Ghibli", 2020, 5500.0);
    car3.data();
    Owner owner4 = new Owner("Ghifari");
    Car car4 = new Car(owner4, "Hyundai Palisade", 2022, 3800.0);
    car4.data();
  }
}
