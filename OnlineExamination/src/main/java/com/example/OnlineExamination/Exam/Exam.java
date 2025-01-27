package com.example.OnlineExamination.Exam;

import com.example.OnlineExamination.Subject.Subject;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;



@Entity
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Subject name;

    @Column(name="exam_desc")
    private String desc;

    @Column(name="exam_date")
    private String date;

    @Column(name="exam_marks")
    private String marks;

    @Column(name="exam_totalQuestion")
    private String totalQuestion;

    @Column(name="exam_passMarks")
    private String passMarks;

    @Column(name="exam_level")
    private String level;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Subject getName() {
        return name;
    }

    public void setName(Subject name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getTotalQuestion() {
        return totalQuestion;
    }

    public void setTotalQuestion(String totalQuestion) {
        this.totalQuestion = totalQuestion;
    }

    public String getPassMarks() {
        return passMarks;
    }

    public void setPassMarks(String passMarks) {
        this.passMarks = passMarks;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }






}

