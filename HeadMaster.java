import java.util.ArrayList;

public class HeadMaster {
    private String name;
    private String IC;
    private String address;
    private int yearsInService;

    public HeadMaster(String name, String IC, String address, int yearsInService) {
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.yearsInService = yearsInService;
    }

    public String getName() {
        return name;
    }

    public String getIC() {
        return IC;
    }

    public String getAddress() {
        return address;
    }

    public int getYearsInService() {
        return yearsInService;
    }
}