package lab55;

public class Employee {
    private String name;

    private String email;

    private Integer hourRate; // casting pe ora

    private Integer capacity; // cate ore lucreaza pe zi

    private Integer freeDays;

    private Integer calculateDailyIncome(){ //hourRate * capacity
        return hourRate * capacity;
    }
    private void calculateMonthlyIncome(){//calculateDailyIncome()*(21 - freeDays)
        System.out.println(calculateDailyIncome()*21 - freeDays);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHourRate(Integer hourRate) {
        this.hourRate = hourRate;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public void setFreeDays(Integer freeDays) {
        this.freeDays = freeDays;
    }
}
