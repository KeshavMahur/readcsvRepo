package com.sortingData;

import com.entity.Student;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        return student.getStdName().compareTo(t1.getStdName());
    }
}
