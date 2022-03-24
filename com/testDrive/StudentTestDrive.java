package com.testDrive;

import com.entity.Student;
import com.service.StudentService;
import com.sortingData.SortById;
import com.sortingData.SortByName;
import com.sortingData.SortBypersentage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTestDrive {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<Student> arrayList = new ArrayList<>();
        Student std1 = new Student();
        std1.setStdID(101);
        std1.setStdName("Anash");
        std1.setStdFname("Ramesh Kumar");
        std1.setStdPersentAge("70%");
        std1.setStdAddress("BSR");
        std1.setStdCource("mca");
        Student std2 = new Student();
        std2.setStdID(102);
        std2.setStdName("Ramesh");
        std2.setStdFname("Ramesh Kumar");
        std2.setStdPersentAge("75%");
        std2.setStdAddress("BSR");
        std2.setStdCource("mca");
        Student std4 = new Student();
        std4.setStdID(104);
        std4.setStdName("Deepesh");
        std4.setStdFname("Ramesh Kumar");
        std4.setStdPersentAge("80%");
        std4.setStdAddress("BSR");
        std4.setStdCource("mca");
        Student std5 = new Student();
        std5.setStdID(105);
        std5.setStdName("Keshav");
        std5.setStdFname("Ramesh Kumar");
        std5.setStdPersentAge("75%");
        std5.setStdAddress("BSR");
        std5.setStdCource("mca");
        Student std3 = new Student();
        std3.setStdID(103);
        std3.setStdName("Anash");
        std3.setStdFname("Ramesh Kumar");
        std3.setStdPersentAge("80%");
        std3.setStdAddress("BSR");
        std3.setStdCource("mca");
        arrayList.add(std1);
        arrayList.add(std5);
        arrayList.add(std3);
        arrayList.add(std4);
        arrayList.add(std2);
        StudentService service = new StudentService();
        System.out.println("Data Sent in file successfully = " + service.writeData(arrayList, "student.csv"));
        System.out.println("Read Data from csv File ");
        ArrayList<Student> newList = service.readData("student.csv");
        System.out.println("Read Data from list ");
        service.filterData(newList);
        System.out.println("Please enter the Chpice For sorting");
        System.out.print("Press\n1 = SortByName\n2 = SortById\n3 = SortByPercentage\n");
        System.out.print("Choice = ");
        int choice = scanner.nextInt();
        boolean b = false;
        switch (choice) {
            case 1:
                b = service.isSorted(newList, new SortByName());
                break;
            case 2:
                b = service.isSorted(newList, new SortById());
                break;
            case 3:
                b = service.isSorted(newList, new SortBypersentage());
                break;
            default:
                System.out.println("Sorry there is No case ");
                break;
        }
        System.out.println("After Soring write data in sorted csvFile");
        if (b) {
            System.out.println("Data Sent = " + service.writeData(newList, "studentSorted.csv"));
        }
    }
}
