package com.example.siddhant.contactsdecoy;

public class ContactsModel {

    private String ContactName;
    private String ContactNumber;
    private String altContactNum;
    private String ema_il;

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }

    public String getAltNum(){
        return altContactNum;
    }

    public void setAltNum(String altNum){
        altContactNum = altNum;
    }

    public String getEmail() {
        return ema_il;
    }

    public void setEmail(String email) {
        ema_il = email;
    }
}
