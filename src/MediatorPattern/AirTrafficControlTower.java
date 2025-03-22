package MediatorPattern;

public interface AirTrafficControlTower {
    void requestTakeoff(Airplane airplane);
    void requestLanding(Airplane airplane);
}