package ProgramingChallenge11;

public class PatientClass {
	private String firstName;
	private String middleName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String emergencyName;
	private String emergencyContact;
	
    public PatientClass(String firstName, String middleName, String lastName, String address, String city, String state, String zip, String phoneNumber, String emergencyName, String emergencyContact) {
    	this.firstName= firstName;
    	this.middleName= middleName;
    	this.lastName= lastName;
    	this.address= address;
    	this.city=city;
    	this.state=state;
    	this.zip=zip;
    	this.phoneNumber=phoneNumber;
    	this.emergencyName=emergencyName;
    	this.emergencyContact = emergencyContact;
    }

    public String getFirstName() {
	    return firstName;
    }

    public void setFirstName(String firstName) {
	    this.firstName = firstName;
    }

    public String getMiddleName() {
    	return middleName;
    }

    public void setMiddleName(String middleName) {
    	this.middleName = middleName;
    }
    
    public String getLastName() {
    	return lastName;
    }
    
    public void setLastName(String lastName) {
    	this.lastName = lastName;
    }
    
    public String getAddress() {
    	return address;
    }
    
    public void setAddress(String address) {
    	this.address = address;
    }
    
    public String getCity() {
    	return city;
    }
    
    public void setCity(String city) {
    	this.city = city;
    }
    
    public String getState() {
    	return state;
    }

    public void setState(String state) {
    	this.state = state;
    }

    public String getZip() {
    	return zip;
    }
    
    public void setZip(String zip) {
    	this.zip = zip;
    }

    public String getPhoneNumber() {
    	return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
    	this.phoneNumber = phoneNumber;
    }

    public String getEmergencyName() {
    	return emergencyName;
    }

    public void setEmergencyName(String emergencyName) {
    	this.emergencyName = emergencyName;
    }

    public String getEmergencyContact() {
    	return emergencyContact;
    }
    
    public void setEmergencyContact(String emergencyContact) {
    	this.emergencyContact = emergencyContact;
    }

}
