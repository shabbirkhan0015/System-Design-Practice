package MediatorPattern;

public interface Airplane {

    void requestTakeoff();
    void requestLanding();
    void notifyAirTrafficControl(String message);

}
