package com.sortingData;

import com.entity.Student;

import java.util.Comparator;

public class SortBypersentage implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        return student.getStdPersentAge().compareTo(t1.getStdPersentAge());
    }
}
