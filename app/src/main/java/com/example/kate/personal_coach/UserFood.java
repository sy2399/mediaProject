package com.example.kate.personal_coach;

/**
 * Created by SeoYeon Choi on 2018-05-05.
 */

public class UserFood {

    private String time;
    private String name;
    private double kcal;
    private String group;
    private String mealType;

    public UserFood(){}

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKcal() {
        return kcal;
    }

    public void setKcal(double kcal) {
        this.kcal = kcal;
    }

    public String getGroup() {
        return group;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
