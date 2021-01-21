public class Oven extends DeviceAb {

    private boolean clock;
    private int cookingType;
    private int foci;
    private boolean cracking;
    private String componentsIncluded;

    private static int timeCreated;

    public Oven(){
        timeCreated++;
        periodicMaintenance();
    }

    public Oven(int height, int length, int depth, String name, String manufacturerName, String deviceType, String componentsIncluded,
                        String energyClass, boolean clock, int cookingType, int foci, boolean cracking)
    {
        timeCreated++;

        setHeight(height);
        setLength(length);
        setDepth(depth);
        setName(name);
        setManufacturerName(manufacturerName);
        setDeviceType(deviceType);
        setEnergyClass(energyClass);

        setClock(clock);
        setCookingType(cookingType);
        setFoci(foci);
        setCracking(cracking);
        setComponentsIncluded(componentsIncluded);
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

        System.out.printf("Clock: %d\n", this.clock);
        System.out.printf("Cooking type: %d\n", this.cookingType);
        System.out.printf("Foci: %d\n", this.foci);
        System.out.printf("Cracking: %d\n", this.cracking);
        System.out.printf("Components included: %d\n", this.componentsIncluded);
    }

    public boolean isClock() {
        return clock;
    }

    public void setClock(boolean clock) {
        this.clock = clock;
    }

    public int getCookingType() {
        return cookingType;
    }

    public void setCookingType(int cookingType) {
        this.cookingType = cookingType;
    }

    public int getFoci() {
        return foci;
    }

    public void setFoci(int foci) {
        this.foci = foci;
    }

    public boolean isCracking() {
        return cracking;
    }

    public void setCracking(boolean cracking) {
        this.cracking = cracking;
    }

    public String getComponentsIncluded() {
        return componentsIncluded;
    }

    public void setComponentsIncluded(String componentsIncluded) {
        this.componentsIncluded = componentsIncluded;
    }
}
