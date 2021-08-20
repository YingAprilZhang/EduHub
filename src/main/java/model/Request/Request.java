/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Request;

import java.util.Date;
import model.CharityEducationGroup.CharityEduManager;
import model.Company.CompanyManager;
import model.Org.Organization;
import model.UserAccount.UserAccount;

/**
 *
 * @author changxu
 */
public abstract class Request {

    public enum RequestType {
        FundRequest("Funding Request"),
        CompanyRequest("Employement Opportunity Request"),
        EduRequest("Class and Teacher Request");

        private String value;

        private RequestType(String value) {
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

    public enum RequestStatusType {
        Sent("Sent"),
        AcceptCountryManager("Accepted by Country Manager"),
        RejectCountryManager("Rejected by Country Manager"),
        AcceptResourceProvider("Accepted by Resource Provider"),
        RejectResourceProvider("Rejected by Resource Provider");

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

    private String title;
    private String message;
    private Organization School;
    private Organization countryManager;
    private Organization resourceProvider;
    private Organization worldManager;
    private Date requestDate;
    private Date resolveDate;
    private RequestType requestType;
    private RequestStatusType requestStatusType;

    public static RequestType getReqTypeByName(String name) {
        return Enum.valueOf(RequestType.class, name);
    }

    public Request() {
        requestDate = new Date();
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public RequestStatusType getRequestStatusType() {
        return requestStatusType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Organization getSchool() {
        return School;
    }

    public void setSchool(Organization School) {
        this.School = School;
    }

    public Organization getCountryManager() {
        return countryManager;
    }

    public void setCountryManager(Organization countryManager) {
        this.countryManager = countryManager;
    }

    public Organization getResourceProvider() {
        return resourceProvider;
    }

    public void setResourceProvider(Organization resourceProvider) {
        this.resourceProvider = resourceProvider;
    }

    public Organization getWorldManager() {
        return worldManager;
    }

    public void setWorldManager(Organization worldManager) {
        this.worldManager = worldManager;
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

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public void setRequestStatusType(RequestStatusType requestStatusType) {
        this.requestStatusType = requestStatusType;
    }

    @Override
    public String toString() {
        return this.title;
    }

}
