package aviacao;

import aviacao.Utils.Time;

public class Flight {
    private Ticket[] tickets;
    private Time time_departure;
    private Time time_destination;
    private String airline;
    private String numberFlight;
    private String airport;
    private String city_departure;
    private String city_destination;

    public Flight(){

    }

    public Flight(Time time_departure, Time time_destination) {
        this.time_departure = time_departure;
        this.time_destination = time_destination;
    }

    public Time getTime_departure() {
        return time_departure;
    }

    public void setTime_departure(Time time_departure) {
        this.time_departure = time_departure;
    }

    public Time getTime_destination() {
        return time_destination;
    }

    public void setTime_destination(Time time_destination) {
        this.time_destination = time_destination;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getNumberFlight() {
        return numberFlight;
    }

    public void setNumberFlight(String numberFlight) {
        this.numberFlight = numberFlight;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getCity_departure() {
        return city_departure;
    }

    public void setCity_departure(String city_departure) {
        this.city_departure = city_departure;
    }

    public String getCity_destination() {
        return city_destination;
    }

    public void setCity_destination(String city_destination) {
        this.city_destination = city_destination;
    }
}
