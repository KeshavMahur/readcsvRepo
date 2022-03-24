package com.sortingData;

import com.entity.Student;

import java.util.Comparator;

public class SortById implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        return student.getStdID() - t1.getStdID();
    }
}
