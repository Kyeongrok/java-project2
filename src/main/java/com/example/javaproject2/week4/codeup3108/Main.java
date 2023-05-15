package com.example.javaproject2.week4.codeup3108;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private String code; // I, D
    private int testId; // 999, 1205
    private String name; // 한라산, 백두산

    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }
}

public class Main {

    private List<Student> students = new ArrayList<>();

    public Student parse(String str){
        String[] splitted = str.split(" ");
        Student student = new Student(splitted[0], Integer.parseInt(splitted[1]), splitted[2]);
        return student;
    }

    // 중복 check
    public boolean isDuplicated(Student pStudent) {
        for(Student student : students) {
            if(student.getTestId() == pStudent.getTestId()){
                return true;
            }
        }
        return false;
    }

    // 학생 넣기
    public void addAStudent(Student student) {
        if(!isDuplicated(student)){
            students.add(student);
        }
    }

    // 전체 출력하기
    public void printAll() {
        for (Student student : students) {
            System.out.printf("%s %d %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }

    public void printSpecificItems(int[] nums) {
        // 정렬
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getTestId() - o2.getTestId();
            }
        });

        // 출력
        for (int i = 0; i < nums.length; i++) {
            Student student = students.get(nums[i] - 1);
            System.out.printf("%d %s\n", student.getTestId(), student.getName());
        }
    }

    public void deleteAStudent(Student pStudent) {
        // index
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if(student.getTestId() == pStudent.getTestId()){
                students.remove(i);
            }
        }

    }

    public void process(Student student) {
        if("I".equals(student.getCode())){
            addAStudent(student);
        } else { // D
            deleteAStudent(student);
        }
    }

    public static void main(String[] args) {

        Main main = new Main();
        String line = "I 1011 한라산";
        Student student = main.parse(line);
        main.process(student);
        main.process(main.parse("I 999 백두산"));
        main.process(main.parse("I 999 오대산"));
        main.process(main.parse("D 999 백두산"));
        main.process(main.parse("I 800 백두산"));
        main.process(main.parse("D 500 한라산"));
        main.process(main.parse("I 900 남산"));
        main.process(main.parse("I 950 금강산"));
        main.process(main.parse("I 1205 지리산"));
        main.process(main.parse("I 700 북한산"));
        main.printSpecificItems(new int[]{1, 2, 4, 5, 6});
    }
}
