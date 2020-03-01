public class CarTest {
    public static void main(String[] args){
        Car c1 = new Car("Ford", "Taurus", 2007);
        System.out.println(c1);
        c1.setModel("Explorer");
        System.out.println(c1);

        Car c2 = new Car("BMW", "2 Series", 1996);
        System.out.println(c2);
        c2.setModel("3 Series");
        c2.setYear(2018);
        System.out.println(c2);

        Car c3 = new Car("Ford", "Explorer", 2019);
        System.out.println(c3);
        c3.setMake("Toyota");
        c3.setModel("Camry");
        System.out.println(c3);

        Car c4 = new Car("Toyota", "Camry Hybrid", 2019);
        System.out.println(c4);
        c4.setYear(2014);
        System.out.println(c4);
    }
}