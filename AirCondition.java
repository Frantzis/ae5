public class AirCondition extends DeviceAb {

    private boolean ionizer;
    private String energyClassHeat;
    private String energyClassThermalArea;
    private String coolingFluid;
    private String thermalPerformance;

    private static int timeCreated;

    public AirCondition(){
        timeCreated++;
        periodicMaintenance();
    }

    public AirCondition(int height, int length, int depth, String name, String manufacturerName, String deviceType, String thermalPerformance,
                          String energyClass, boolean ionizer, String energyClassHeat, String energyClassThermalArea, String coolingFluid)
    {
        timeCreated++;

        setHeight(height);
        setLength(length);
        setDepth(depth);
        setName(name);
        setManufacturerName(manufacturerName);
        setDeviceType(deviceType);
        setEnergyClass(energyClass);

        setIonizer(ionizer);
        setEnergyClassHeat(energyClassHeat);
        setEnergyClassThermalArea(energyClassThermalArea);
        setCoolingFluid(coolingFluid);
        setThermalPerformance(thermalPerformance);
    }

    public static int getTimeCreated(){
        return timeCreated;
    }

    public int periodicMaintenance(){
        return 0;
    }

    private int periodicMaintenance(int overloading){
        return 0;
    }

    public void printAll(){
        System.out.println("Washing Machine");

        System.out.printf("Height: %d\n", this.height);
        System.out.printf("Length: %d\n", this.length);
        System.out.printf("Depth: %d\n", this.depth);
        System.out.printf("Name: %d\n", this.name);
        System.out.printf("Manufacturer: %d\n", this.manufacturerName);
        System.out.printf("Type of the device: %d\n", this.deviceType);
        System.out.printf("The energy class is %d\n", this.energyClass);

        System.out.printf("Ionizer: %d\n", this.ionizer);
        System.out.printf("Energy class heat: %d\n", this.energyClassHeat);
        System.out.printf("Energy class thermal Area: %d\n", this.energyClassThermalArea);
        System.out.printf("Cooling Fluid: %d\n", this.coolingFluid);
        System.out.printf("Thermal performance: %d\n", this.thermalPerformance);
    }

    public boolean isIonizer() {
        return ionizer;
    }

    public void setIonizer(boolean ionizer) {
        this.ionizer = ionizer;
    }

    public String getEnergyClassHeat() {
        return energyClassHeat;
    }

    public void setEnergyClassHeat(String energyClassHeat) {
        this.energyClassHeat = energyClassHeat;
    }

    public String getEnergyClassThermalArea() {
        return energyClassThermalArea;
    }

    public void setEnergyClassThermalArea(String energyClassThermalArea) {
        this.energyClassThermalArea = energyClassThermalArea;
    }

    public String getCoolingFluid() {
        return coolingFluid;
    }

    public void setCoolingFluid(String coolingFluid) {
        this.coolingFluid = coolingFluid;
    }

    public String getThermalPerformance() {
        return thermalPerformance;
    }

    public void setThermalPerformance(String thermalPerformance) {
        this.thermalPerformance = thermalPerformance;
    }


}
