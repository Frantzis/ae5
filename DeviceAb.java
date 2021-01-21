public abstract class DeviceAb  implements DeviceBasic{

    protected int height;
    protected int length;
    protected int depth;
    protected String name;
    protected String manufacturerName;
    protected String deviceType;
    protected String energyClass;
    protected boolean status;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getEnergyClass() {
        return energyClass;
    }

    public void setEnergyClass(String energyClass) {
        this.energyClass = energyClass;
    }

    public void powerOn ()
    {
        this.status=true;
    };

    public void powerOff ()
    {
        this.status=false;
    };
    public int periodicMantainance()
    {
        return 0;
    };
    public boolean status()
    {
        return this.status;
    };


    public abstract void printAll();
}
