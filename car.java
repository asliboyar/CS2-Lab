public class Car{
    String make;
    String model;
    int year;

    public Car(String make, String model,int year){
        this.make = make;
        this.model= model;
        this.year = year;
    }

    public String getMake(){
        return this.make;

    }

    public String getModel(String string){
        return this.model;
    }

    public int getYear(){
        return this.year;
    }

    public void setMake(String newMake) {
        this.make = newMake;
    }

    public void setModel(String newModel) {
        this.model = newModel;
    }

    public void setYear(int newYear){
        this.year = newYear;
    }

    public String toString() {

        return "\nCar make: " + make + "\nCar model: " + model + "\nCar Year: " + year;
    }

}