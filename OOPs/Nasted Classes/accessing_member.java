class Car {
    String carName;
    String carType;

    public Car(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }

    // private method
    private String getCarName() {
        return this.carName;
    }

    // inner class
    class engine {
        String engineType;

    }
}

public class accessing_member {

}
