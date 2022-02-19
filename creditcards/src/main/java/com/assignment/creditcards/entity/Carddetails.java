package com.assignment.creditcards.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "carddetails")
public class Carddetails 
{
    @Id
    @Column
    private String id;
    
    @Column
    @NotNull(message="Card Number must not be empty")
    @Pattern(regexp="[\\d]{16}", message="Invalid Card Number")
	private String cardnumber;
    
    @Column
    @NotNull(message="Name on card must not be empty")
    @Size(min=2, max=20, message="Name must contain atleast two characters")
	private String name;
    
    @Column
    @NotNull(message="expiry must not be empty")
    @Size(min=5, max=5, message="Invalid expiry date")
	private String expiry;
    
    @Column
    @NotNull(message="cvc must not be empty")
    @Size(min=3, max=4, message="Invalid cvc")
	private String cvc;
    
	public Carddetails(String id, String cardnumber, String name, String expiry, String cvc) {
		super();
		this.id = id;
		this.cardnumber = cardnumber;
		this.name = name;
		this.expiry = expiry;
		this.cvc = cvc;
	}
	public String getCardNumber() {
		return cardnumber;
	}
	public void setCardNumber(String cardNumber) {
		cardnumber = cardNumber;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpiry() {
		return expiry;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	public String getCvc() {
		return cvc;
	}
	public Carddetails() {
		super();
	}
	public void setCvc(String cvc) {
		this.cvc = cvc;
	}
	@Override
	public String toString() {
		return "Carddetails [id=" + id + ", cardnumber=" + cardnumber + ", name=" + name + ", expiry=" + expiry
				+ ", cvc=" + cvc + "]";
	}
	
	
	

}
