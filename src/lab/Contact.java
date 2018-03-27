package lab;

/**
 *
 * @author Harjap Singh
 */

 public class Contact{private String firstName, lastName,emailAddress;
    
    public Contact(String firstName,String lastName, String emailAddress){
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress=emailAddress;
    
    
    }   
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws IllegalException {
        if(firstName.isEmpty()){
        throw new IllegalException("Cannot be empty");
        }
        else
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws IllegalException {
        if(lastName.isEmpty()){
            throw new IllegalException("Cannot be empty");
        }
        else
            this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) throws IllegalException {
        if(firstName.isEmpty()){
            throw new IllegalException("Cannot be empty");
        }
        else
            this.emailAddress = emailAddress;
    }
   
}
