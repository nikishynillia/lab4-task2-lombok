public class Main {
    public static void main(String[] args){
        Car car1 = new Car("M3", "BMW", 2025, 67000, "Black", 2);
        Car car2 = new Car("M6", "BMW", 2026, 134000, "Purple", 5);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getColor());
        car1.setColor("Black");
        System.out.println("Are these objects equal? " + car1.equals(car2));
        System.out.println("The HashCode of this obj is: " + car1.hashCode());
        System.out.println("The HashCode of this obj is: " + car2.hashCode());

    }

}


