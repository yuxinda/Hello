package sis.studentinfo;


public class Student {
    String name;
    private int credits;
    private String state = "";
    static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
    static final String IN_STATE = "Beijing";
    public Student(String name){
        this.credits = 0;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getCredits() {
        return credits;
    }
    public void addCredits(int credits) {
        this.credits += credits;
    }
    public boolean isFullTime() {
        return credits >= CREDITS_REQUIRED_FOR_FULL_TIME;
    }

    public boolean isInState() {
        return state.equals(Student.IN_STATE);
    }
    public void setState(String state) {
        this.state = state;
    }
}
