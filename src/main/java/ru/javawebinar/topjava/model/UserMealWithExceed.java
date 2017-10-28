package ru.javawebinar.topjava.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * GKislin
 * 11.01.2015.
 */
public class UserMealWithExceed {
    private final LocalDate date;
    private final LocalTime time;
    private final String description;

    private final int calories;

    private final boolean exceed;

    public UserMealWithExceed(LocalDateTime dateTime, String description, int calories, boolean exceed) {
        this.date = dateTime.toLocalDate();
        this.time = dateTime.toLocalTime();
        this.description = description;
        this.calories = calories;
        this.exceed = exceed;
    }
    public UserMealWithExceed(UserMeal userMeal, boolean exceed) {
        this.date = userMeal.getDate();
        this.time = userMeal.getTime();
        this.description = userMeal.getDescription();
        this.calories = userMeal.getCalories();
        this.exceed = exceed;
    }

    @Override
    public String toString() {
        return "UserMealWithExceed{" +
                "dateTime=" + LocalDateTime.of(date, time) +
                ", description='" + description + '\'' +
                ", calories=" + calories +
                ", exceed=" + exceed +
                '}';
    }
}
