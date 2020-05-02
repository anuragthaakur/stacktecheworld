package com.stacktecheworld.resservices.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder(toBuilder = true)
public class UserDetails {
private String firstName;
private String LastName;
private String city;

public UserDetails() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "UserDetails [firstName=" + firstName + ", LastName=" + LastName + ", city=" + city + "]";
}
public UserDetails(String firstName, String lastName, String city) {
	super();
	this.firstName = firstName;
	LastName = lastName;
	this.city = city;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((LastName == null) ? 0 : LastName.hashCode());
	result = prime * result + ((city == null) ? 0 : city.hashCode());
	result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	UserDetails other = (UserDetails) obj;
	if (LastName == null) {
		if (other.LastName != null)
			return false;
	} else if (!LastName.equals(other.LastName))
		return false;
	if (city == null) {
		if (other.city != null)
			return false;
	} else if (!city.equals(other.city))
		return false;
	if (firstName == null) {
		if (other.firstName != null)
			return false;
	} else if (!firstName.equals(other.firstName))
		return false;
	return true;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


}
