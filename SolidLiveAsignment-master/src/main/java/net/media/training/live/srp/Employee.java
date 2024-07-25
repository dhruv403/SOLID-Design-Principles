package net.media.training.live.srp;

public class Employee {
    private int empId;
    private static final int TOTAL_LEAVES_ALLOWED = 30;

    private double monthlySalary;
    private String name;
    private String addressStreet;
    private String addressCity;
    private String addressCountry;
    private int leavesTaken;
    private String manager;
    private int yearsInOrg;
    private int[] leavesLeftPreviously;
    private int totalLeavesLeft = 0;

    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.manager = manager;
        this.yearsInOrg = leavesLeftPreviously.length;

    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getManager() {
        return manager;
    }

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public int getTotalLeaveAllowed() {
        return TOTAL_LEAVES_ALLOWED;
    }

    public int getYearsInOrg() {
        return yearsInOrg;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public int[] getLeavesLeftPreviously() {
        return leavesLeftPreviously;
    }

    public int getTotalLeavesLeft() {
        return totalLeavesLeft;
    }

    public void calculateTotalLeavesLeft() {

        totalLeavesLeft = 0;
        for (int i = 0; i < Math.min(3, yearsInOrg); i++) {
            totalLeavesLeft += leavesLeftPreviously[yearsInOrg-i-1];
        }
    }
}








