package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary,
                     JuniorDeveloper[] juniorDevelopers,
                     MidDeveloper[] midDevelopers,
                     SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public void addEmployee(int index, JuniorDeveloper dev) {
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = dev;
            } else {
                System.out.println("Index is full: Some record exists.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index not found: " + index);
        }
    }

    // MidDeveloper
    public void addEmployee(int index, MidDeveloper dev) {
        try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = dev;
            } else {
                System.out.println("Index is full: Some record exists.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index not found: " + index);
        }
    }

    // SeniorDeveloper
    public void addEmployee(int index, SeniorDeveloper dev) {
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = dev;
            } else {
                System.out.println("Index is full: Some record exists.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index not found: " + index);
        }
    }

    @Override
    public void work() {
        System.out.println(getName() + " HR Manager starts to working");
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
