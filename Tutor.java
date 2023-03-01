import java.util.ArrayList;

public class Tutor {
    private String name;
    private String IC;
    private String address;
    private String qualification;
    private int yearsOfExperience;
    private int yearsInCenter;

    public Tutor(String name, String IC, String address, String qualification, int yearsOfExperience, int yearsInCenter) {
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.qualification = qualification;
        this.yearsOfExperience = yearsOfExperience;
        this.yearsInCenter = yearsInCenter;
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

    public String getQualification() {
        return qualification;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public int getYearsInCenter() {
        return yearsInCenter;
    }
}