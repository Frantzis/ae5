public class WashineMachine extends DeviceAb {

    private int capacity;
    private boolean steamProgram;
    private boolean touchScreen;
    private boolean autoRefill;
    private boolean fastProgram;

    private static int timeCreated;

    public WashineMachine(){
        timeCreated++;
        periodicMaintenance();
    }

    public WashineMachine(int height, int length, int depth, String name, String manufacturerName, String deviceType,
                          String energyClass, int capacity, boolean steamProgram, boolean autoRefill, boolean touchScreen, boolean fastProgram)
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
        setSteamProgram(steamProgram);
        setTouchScreen(touchScreen);
        setAutoRefill(autoRefill);
        setFastProgram(fastProgram);
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

        System.out.printf("Capacity: %d\n", this.capacity);
        System.out.printf("Steam program: %d\n", this.steamProgram);
        System.out.printf("Touch screen: %d\n", this.touchScreen);
        System.out.printf("Auto refill: %d\n", this.autoRefill);
        System.out.printf("Fast program: %d\n", this.fastProgram);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isSteamProgram() {
        return steamProgram;
    }

    public void setSteamProgram(boolean steamProgram) {
        this.steamProgram = steamProgram;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public boolean isAutoRefill() {
        return autoRefill;
    }

    public void setAutoRefill(boolean autoRefill) {
        this.autoRefill = autoRefill;
    }

    public boolean isFastProgram() {
        return fastProgram;
    }

    public void setFastProgram(boolean fastProgram) {
        this.fastProgram = fastProgram;
    }

}
