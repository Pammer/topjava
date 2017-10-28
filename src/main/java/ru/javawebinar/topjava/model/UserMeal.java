package ru.javawebinar.topjava.model;

import ru.javawebinar.topjava.util.UserMealsUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * GKislin
 * 11.01.2015.
 */
public class UserMeal {
    private final LocalTime time;
    private final LocalDate date;

    private final String description;
    private final int calories;

    public UserMeal(LocalDateTime dateTime, String description, int calories) {
        this.date = dateTime.toLocalDate();
        this.time = dateTime.toLocalTime();
        this.description = description;
        this.calories = calories;
        UserMealsUtil.addCalories(dateTime.toLocalDate(),calories);
    }

    public LocalTime getTime() {
        return time;
    }

    public LocalDate getDate() {
        return date;
    }
    public Integer getDateCalories() {
        return UserMealsUtil.getTotalCaloriesForDate(date);
    }

    public String getDescription() {
        return description;
    }

    public int getCalories() {
        return calories;
    }
}
