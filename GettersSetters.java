public class GettersSetters {
    public static void main(String[] args){
        GSCar car = new GSCar();

        car.setMake("Porsche");
        car.setModel("Carrera");

        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());
        car.describeCar();
    }
}
