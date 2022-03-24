package com.service;

import com.entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentService {

    public boolean writeData(List<Student> arrayList, String fileName) throws IOException {
        if (!arrayList.isEmpty()) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (Student std : arrayList) {
                writer.write(std.toString());
                writer.newLine();
                writer.flush();
            }
            writer.close();
            return true;
        }
        return false;
    }

    public ArrayList<Student> readData(String fileName) throws IOException {
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()) {
            String[] str = reader.readLine().split(",");
            Student student = new Student();
            student.setStdID(Integer.parseInt(str[0]));
            student.setStdName(str[1]);
            student.setStdFname(str[2]);
            student.setStdPersentAge(str[3]);
            student.setStdAddress(str[4]);
            student.setStdCource(str[5]);
            list.add(student);
        }
        reader.close();
        return !list.isEmpty() ? list : null;
    }

    public void filterData(List<Student> arrayList) {
        for (Student std : arrayList) {
            System.out.println(std);
        }
    }

    public boolean isSorted(List<Student> list, Comparator<Student> comparator) {
        if (!list.isEmpty() && comparator != null) {
            list.sort(comparator);
            return true;
        } else {
            return false;
        }
    }
}
