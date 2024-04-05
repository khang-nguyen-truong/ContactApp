package miu.edu.cs489.model;

import java.util.Map;

public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private Map<String, String> phoneNumbers;
    private Map<String, String> emailAddresses;

    public  Contact(){};

    public Contact(String firstName, String lastName, String company, String jobTitle, Map<String, String> phoneNumbers, Map<String, String> emailAddresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phoneNumbers = phoneNumbers;
        this.emailAddresses = emailAddresses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Map<String, String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Map<String, String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Map<String, String> getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(Map<String, String> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }
}
