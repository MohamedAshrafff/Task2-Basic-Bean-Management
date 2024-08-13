package com.sumerge.task3;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BasicCourses implements CourseRecommender {

    @Override
    public List<Course> recommendedCourses() {
        return new ArrayList<>(
                Arrays.asList(
                new Course("Basic Courses") ,
                new Course("Intro to CS") ,
                new Course("MATH 1")));
    }

}
