

public class Driver {
        public static void main(String[] args) {

        Bicycle myBike = new Bicycle();
System.out.println("\nmyBike \"Instance of\" Checks");
if (myBike instanceof Bicycle)
            System.out.println("Instance of Bicycle: True");
else
        System.out.println("Instance of Bicycle: False");
if (myBike instanceof TwoWheeled)
            System.out.println("Instance of TwoWheeled: True");
else
        System.out.println("Instance of TwoWheeled: False");
if (myBike instanceof Vehicle)
            System.out.println("Instance of Vehicle: True");
else
        System.out.println("Instance of Vehicle: False");
if (myBike instanceof Object)
            System.out.println("Instance of Object: True");
else
        System.out.println("Instance of Object: False");
        }
    }
