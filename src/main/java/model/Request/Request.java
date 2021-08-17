/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Request;

import java.util.Date;
import model.CharityEducationGroup.CharityEduGroup;
import model.Company.Company;
import model.Student.Student;
import model.UserAccount.UserAccount;

/**
 *
 * @author changxu
 */
public abstract class Request {

    public enum RequestStatusType {
        SendingToCharityEduGroup("Sending to Charity Education"),
        SendingToCharityFundGroup("Sending to Charity Funding"),
        SendingToAccountant("sending to Accountant"),
        Accept("Accept"),
        Denied("Denied"),
        SendingInterview("Sending Interview "),
        AskForInterview("Ask for Interview");

        private String value;

        private RequestStatusType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }

    }
    
        private Company company;
    private Student student;
    //private InterviewList interviewList;
    private CharityEduGroup eduGroup;


    private String title;
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    
    
    public Request() {
        requestDate = new Date();
    }
    
    public Request(String message, Company company, Student student){
        
        this.message = message;
        this.company = company;
        this.student = student;
        //this.interviewList = interviewList;
        
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

//    public InterviewList getInterviewList() {
//        return interviewList;
//    }
//
//    public void setInterviewList(InterviewList interviewList) {
//        this.interviewList = interviewList;
//   }

    public CharityEduGroup getEduGroup() {
        return eduGroup;
    }

    public void setEduGroup(CharityEduGroup eduGroup) {
        this.eduGroup = eduGroup;
    }

    
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override

    public String toString() {
        return this.title;
    }

}
