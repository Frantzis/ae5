public class Fridge extends DeviceAb {
    //oi 5 idiotikes parametroi

    private int capacity;
    private String climateZone;
    private boolean antibacterial;
    private int shelves;
    private int bottleHolder;

    private static int timeCreated;

    public Fridge(int height, int length, int depth, String name, String manufacturerName, String deviceType,
                  String energyClass,int capacity, String climateZone, boolean antibacterial, int shelves, int bottleHolder)
    {
        timeCreated++;

        setHeight(height);
        setLength(length);
        setDepth(depth);
        setName(name);
        setManufacturerName(manufacturerName);
        setDeviceType(deviceType);
        setEnergyClass(energyClass);

        setCapacity(capacity);
        setClimateZone(climateZone);
        setAntibacterial(antibacterial);
        setShelves(shelves);
        setBottleHolder(bottleHolder);
    }

    public Fridge(){
        periodicMaintenance();
        timeCreated++;
    }

    public int periodicMaintenance(){
        return 0;
    }

    private int periodicMaintenance(int overloading){
        return 0;
    }

    public void printAll(){
        System.out.println("Fridge");

        System.out.printf("Height: %d\n", this.height);
        System.out.printf("Length: %d\n", this.length);
        System.out.printf("Depth: %d\n", this.depth);
        System.out.printf("Name: %d\n", this.name);
        System.out.printf("Manufacturer: %d\n", this.manufacturerName);
        System.out.printf("Type of the device: %d\n", this.deviceType);
        System.out.printf("The energy class is %d\n", this.energyClass);

        System.out.printf("Capacity: %d\n", this.capacity);
        System.out.printf("Climate zone is: %d\n", this.climateZone);
        System.out.printf("Antibacterial: %d\n", this.antibacterial);
        System.out.printf("Number of shelves is: %d\n", this.shelves);
        System.out.printf("The number of bottle holders is: %d\n", this.bottleHolder);
    }

    public static int getTimeCreated()
    {
        return timeCreated;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getClimateZone() {
        return climateZone;
    }

    public void setClimateZone(String climateZone) {
        this.climateZone = climateZone;
    }

    public boolean isAntibacterial() {
        return antibacterial;
    }

    public void setAntibacterial(boolean antibacterial) {
        this.antibacterial = antibacterial;
    }

    public int getShelves() {
        return shelves;
    }

    public void setShelves(int shelves) {
        this.shelves = shelves;
    }

    public int getBottleHolder() {
        return bottleHolder;
    }

    public void setBottleHolder(int bottleHolder) {
        this.bottleHolder = bottleHolder;
    }
}
