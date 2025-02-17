package web.model;

import java.util.Objects;

public class Car {

    private String model;
    private String color;
    private int horsePower;

    public Car() {
    }

    public Car(String model, String color, int horsePower) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return horsePower == car.horsePower && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        int hash = 31;

        hash = hash * 31 + (model == null ? 0 : model.hashCode());
        hash = hash * 31 + (color == null ? 0 : color.hashCode());
        hash = hash * 31 + horsePower;

        return hash;
    }

    @Override
    public String toString() {
        String sb = "Car{" + "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", horsePower=" + horsePower +
                '}';
        return sb;
    }
}
