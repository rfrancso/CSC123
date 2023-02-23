public class AircraftLab4a {
    public String name;
    public int maxSpeed;
    public int maxAltitude;

    public AircraftLab4a(String name, int maxSpeed, int maxAltitude) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.maxAltitude = maxAltitude;
    }
}

public class FixedWingAircraft extends AircraftLab4a {
    public int wingSpan;
    public int numEngines;
    public int cruisingSpeed;

    public FixedWingAircraft(String name, int maxSpeed, int maxAltitude, int wingSpan, int numEngines, int cruisingSpeed) {
        super(name, maxSpeed, maxAltitude);
        this.wingSpan = wingSpan;
        this.numEngines = numEngines;
        this.cruisingSpeed = cruisingSpeed;
    }
}

public class RotaryAircraft extends AircraftLab4a {
    public int rotorDiameter;
    public int numRotors;
    public int maxRange;

    public RotaryAircraft(String name, int maxSpeed, int maxAltitude, int rotorDiameter, int numRotors, int maxRange) {
        super(name, maxSpeed, maxAltitude);
        this.rotorDiameter = rotorDiameter;
        this.numRotors = numRotors;
        this.maxRange = maxRange;
    }
}

public class MilitaryJet extends FixedWingAircraft {
    public int numWeapons;
    public String weaponSystems;

    public MilitaryJet(String name, int maxSpeed, int maxAltitude, int wingSpan, int numEngines, int cruisingSpeed, int numWeapons, String weaponSystems) {
        super(name, maxSpeed, maxAltitude, wingSpan, numEngines, cruisingSpeed);
        this.numWeapons = numWeapons;
        this.weaponSystems = weaponSystems;
    }
}

public class CivilianAircraft extends FixedWingAircraft {
    public int numSeats;
    public int inFlightEntertainment;

    public CivilianAircraft(String name, int maxSpeed, int maxAltitude, int wingSpan, int numEngines, int cruisingSpeed, int numSeats, int inFlightEntertainment) {
        super(name, maxSpeed, maxAltitude, wingSpan, numEngines, cruisingSpeed);
        this.numSeats = numSeats;
        this.inFlightEntertainment = inFlightEntertainment;
    }
}

public class ManeuverableFixedWingAircraft extends FixedWingAircraft {
    public boolean canVTOL;

    public ManeuverableFixedWingAircraft(String name, int maxSpeed, int maxAltitude, int wingSpan, int numEngines, int cruisingSpeed, boolean canVTOL) {
        super(name, maxSpeed, maxAltitude, wingSpan, numEngines, cruisingSpeed
    }
}