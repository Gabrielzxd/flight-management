package aviacao.Utils;

import aviacao.Exceptions.TimeException;

public class Time {
    private String value;

    public Time(String value) throws TimeException {
        if(!isValid(value)) {
            throw new TimeException("Invalid value" + value);
        }
        this.value = value;
    }

    @Override
    public String toString() {
        return "Time{" +
                "value='" + value + '\'' +
                '}';
    }

    public boolean isValid(String value) {
        if(value == null || value.length() < 5){
            return false;
        }

        char h1 = value.charAt(0);
        char h2 = value.charAt(1);
        char sep = value.charAt(2);
        char m1 = value.charAt(3);
        char m2 = value.charAt(4);

        if(!Character.isDigit(h1) ||  !Character.isDigit(h2) || !Character.isDigit(m1) || !Character.isDigit(m2)){
            return false;
        }

        if(sep != ':'){
            return false;
        }

        int hour = Integer.parseInt(value.substring(0, 2));
        int minute = Integer.parseInt(value.substring(3, 5));

        return (hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

