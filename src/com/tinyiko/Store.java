package com.tinyiko;

import java.util.*;

public class Store {

    protected static Map<String,ContactDetails> name = new HashMap<>();
    protected static Map<String,ContactDetails> phoneNumber = new HashMap<>();

    public static void main(String[] args) {

        List<ContactDetails> contactDetails = buildContactDetailsObject();
        storeContactDetailsInMaps(contactDetails);
        retrievePhoneNumbersFromNameMapUsingNameAsKey();
        retrieveNamesFromPhoneNumberMapUsingPhoneNumberAsKey();
        removeNameUsingKey();
        clearHashMaps();

    }

    private static List<ContactDetails> buildContactDetailsObject() {

        List<ContactDetails> contactDetails = new ArrayList<>();
        contactDetails.add(new ContactDetails("Ntikelo", "000000"));
        contactDetails.add(new ContactDetails("lefa", "11111"));
        contactDetails.add(new ContactDetails("Tinyiko", "22222"));
        contactDetails.add(new ContactDetails("Aya", "3333"));
        contactDetails.add(new ContactDetails("Aya", "444"));
        contactDetails.add(new ContactDetails(null, "555"));
        contactDetails.add(new ContactDetails());

        return contactDetails;
    }

    static void storeContactDetailsInMaps(List<ContactDetails> contactDetails ){

        for (ContactDetails contactDetail : contactDetails){
            name.put(contactDetail.getName(), contactDetail);
            phoneNumber.put(contactDetail.getPhoneNumber(), contactDetail);
        }
    }

    private static void retrievePhoneNumbersFromNameMapUsingNameAsKey() {

        System.out.println("Phone Numbers");
        var keys = name.keySet();
        for (var key : keys){
            var contactDetail = name.get(key);
            System.out.println(contactDetail.getPhoneNumber());
        }
    }

    private static void retrieveNamesFromPhoneNumberMapUsingPhoneNumberAsKey() {

        System.out.println("Names");
        var keys = phoneNumber.keySet();
        for (var key : keys){
            var contactDetail = phoneNumber.get(key);
            System.out.println(contactDetail.getName());

        }

    }

    private static void removeNameUsingKey() {
        if (name.containsKey("Aya")){
            System.out.println("yes theres aya");
            name.remove("Aya");
            System.out.println(" aya removed");
            System.out.println(name);
        }
        System.out.println("After removing Aya i should not get contact of aya 444");
        retrievePhoneNumbersFromNameMapUsingNameAsKey();
    }

    private static void clearHashMaps() {
        name.clear();
        phoneNumber.clear();

        System.out.println("Names cleared =>"+ name + " phone numbers cleared =>"+phoneNumber);
    }

}
