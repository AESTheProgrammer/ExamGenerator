package com.company;

//Library
import java.util.*;

/**
 * @author Mohammad Mehdi Nazari (github.com/MMNazari1380) & Armin Ebrahimi Saba (github.com/AESTheProgrammer)
 * @version 1.0
 * @since 2022-12-19
 */
public class Instructor {

    //Fields
    private BasicExam[] builtExams;
    private BasicExam  currentExam;
    private int isLoggedin;
    private String username;

    //Constructor
    public Instructor() {}

    //Methods
    public BasicExam initiateExam() {
        return (BasicExam) null;
    }

    public Boolean login(String password, String username) {
        return Boolean.FALSE;
    }

    public void saveExamFile(BasicExam exam, String address) {}

}
