package aviacao;

import aviacao.Utils.Class;

public class SeatConfig {
    private String number;
    private Class class_flight;
    private boolean status;

    public SeatConfig(String number, Class class_flight, boolean status) {
        this.number = number;
        this.class_flight = class_flight;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "number='" + number + '\'' +
                ", class_flight=" + class_flight +
                ", status=" + status +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Class getClass_flight() {
        return class_flight;
    }

    public void setClass_flight(Class class_flight) {
        this.class_flight = class_flight;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
