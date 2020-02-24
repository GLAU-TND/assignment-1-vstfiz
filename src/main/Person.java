package main;

import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;
    private ArrayList<String> mobiles = new ArrayList<String>();
    private String emailAddress;

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMobiles(ArrayList<String> mobiles) {
        this.mobiles = mobiles;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<String> getMobiles() {
        return mobiles;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Person(String firstName, String lastName, ArrayList<String> mobiles, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobiles = mobiles;
        this.emailAddress = emailAddress;
    }
    public Person(String firstName, String lastName, ArrayList<String> mobiles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobiles = mobiles;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------- * -------- * -------- * --------\n");
        sb.append("First Name: " + this.firstName+"\n");
        sb.append("First Name: " + this.lastName+"\n");
        if (this.mobiles.size() == 1) {
            sb.append("Contact Number: ");
        } else {
            sb.append("Contact Number(s): ");
        }
        for(int i=0;i<this.mobiles.size();i++){
            if(i != this.mobiles.size()-1){
                sb.append(this.mobiles.get(i));
                sb.append(", ");
            }
            else{
                sb.append(this.mobiles.get(i));
                sb.append("\n");
            }
        }
        if(this.emailAddress!= null && this.emailAddress!=""){
            sb.append("Email address: " + this.emailAddress+"\n");
        }
        sb.append("-------- * -------- * -------- * --------\n");
        return sb.toString();
    }
}
