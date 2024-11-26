package com.example.OnlineExamination.Result;

import com.example.OnlineExamination.Exam.Exam;
import com.example.OnlineExamination.Subject.Subject;
import com.example.OnlineExamination.User.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



@Entity
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="result_status")
    private String status;

    @Column(name="result_score")
    private String score;

    @Column(name="exam_date")
    private String edate;

    @Column(name="total_marks")
    private String totalMarks;

    @Column(name="total_question")
    private String totalQuestion;

    @ManyToOne
    @JoinColumn(name= "exam_name")
    private Subject sname;

    @ManyToOne
    @JoinColumn(name= "user_email")
    private User email;

    @ManyToOne
    @JoinColumn(name= "exam_id")
    private Exam examId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getEdate() {
        return edate;
    }

    public void setEdate(String edate) {
        this.edate = edate;
    }

    public String getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(String totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getTotalQuestion() {
        return totalQuestion;
    }

    public void setTotalQuestion(String totalQuestion) {
        this.totalQuestion = totalQuestion;
    }

    public Subject getSname() {
        return sname;
    }

    public void setSname(Subject sname) {
        this.sname = sname;
    }

    public User getEmail() {
        return email;
    }

    public void setEmail(User email) {
        this.email = email;
    }

    public Exam getExamId() {
        return examId;
    }

    public void setExamId(Exam examId) {
        this.examId = examId;
    }







}
