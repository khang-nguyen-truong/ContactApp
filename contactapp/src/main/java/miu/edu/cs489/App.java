package miu.edu.cs489;

import java.util.Map;
import java.util.Map.Entry;

import static java.util.Map.entry;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import miu.edu.cs489.model.Contact;

public class App 
{
    public static void printContacts(Contact[] contacts) {

        List<Contact> contactList = Arrays.asList(contacts);
        Collections.sort(contactList, Comparator.comparing(Contact::getLastName));

        System.out.println("[");

        for (Contact contact: contactList) {
            String contactLine = String.format("\t{ firstName: %s, lastName: %s, company: %s, jobTitle: %s", 
                                                contact.getFirstName(),
                                                contact.getLastName(),
                                                contact.getCompany(),
                                                contact.getJobTitle()
                                                );
            System.out.print(contactLine);

            if (!contact.getPhoneNumbers().isEmpty()) {
                System.out.print(", phoneNumbers: [ ");

                for (Entry<String, String>  phoneNumber: contact.getPhoneNumbers().entrySet()) {
                    String phoneNumberLine = String.format("{ number: %s, label: %s}, ",
                                                            phoneNumber.getKey(),
                                                            phoneNumber.getValue()
                                                            );
                    System.out.print(phoneNumberLine);
                }
                
                System.out.print("]");
            }

            if (!contact.getEmailAddresses().isEmpty()) {
                System.out.print(", emailAddresses: [ ");

                for (Entry<String, String>  emailAddress: contact.getEmailAddresses().entrySet()) {
                    String emailAddressLine = String.format("{ email: %s, label: %s}, ",
                                                            emailAddress.getKey(),
                                                            emailAddress.getValue()
                                                            );
                    System.out.print(emailAddressLine);
                }

                System.out.print("]");
            }

            System.out.println(" }");
        }

        System.out.println("]");
    }

    public static void main( String[] args )
    {
        Contact contact1 = new Contact("David", 
                                        "Sanger", 
                                        "Argos LLC",
                                        "Sales Manager",
                                        Map.ofEntries(
                                            entry("240-133-0011", "Home"),
                                            entry("240-112-0123", "Mobile")),
                                        Map.ofEntries(
                                            entry("dave.sang@gmail.com", "Home"),
                                            entry("dsanger@argos.com", "Work"))
                                            );
        Contact contact2 = new Contact("Carlos",
                                        "Jimenez",
                                        "Zappos",
                                        "Director",
                                        Map.of(),
                                        Map.of()
                                        );
        Contact contact3 = new Contact("Ali",
                                        "Gafar",
                                        "BMI Services",
                                        "HR Manager",
                                        Map.of("412-116-9988", "Work"), 
                                        Map.of("ali@bmi.com", "Work") 
                                        );

        Contact[] contactList = {contact1, contact2, contact3};

        printContacts(contactList);
    }
}
