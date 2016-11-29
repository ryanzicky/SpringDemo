package pack1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("addressBean")
public class Address {

//	@Value("GaoDeng,QiongShang")
	private String street;
	
//	@Value("571100")
	private int postCode;
	
//	@Value("CN")
	private String country;
	
	public String getFullAddress(String prefix){
		return prefix + " : " + street + " " + postCode + " " + country;
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", postCode=" + postCode
				+ ", country=" + country + "]";
	}
}
