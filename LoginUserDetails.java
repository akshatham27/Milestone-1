package  common;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.catrionbe.api.service.DateStringDeserializer;
import com.catrionbe.api.service.DateStringSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
 

@Entity
@Table(name="ccpuserdetails") 
public class LoginUserDetails {
 
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	 
	 @Column(name = "firstName", nullable = false) 
	private String  firstName;
	 public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPrnNumber() {
		return prnNumber;
	}
	public void setPrnNumber(String prnNumber) {
		this.prnNumber = prnNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfPassword() {
		return confPassword;
	}
	public void setConfPassword(String confPassword) {
		this.confPassword = confPassword;
	}
	public int getOtpGenerated() {
		return otpGenerated;
	}
	public void setOtpGenerated(int otpGenerated) {
		this.otpGenerated = otpGenerated;
	}
	public int getOtpEntered() {
		return otpEntered;
	}
	public void setOtpEntered(int otpEntered) {
		this.otpEntered = otpEntered;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getGrandFatherName() {
		return grandFatherName;
	}
	public void setGrandFatherName(String grandFatherName) {
		this.grandFatherName = grandFatherName;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getIsAprroved() {
		return isAprroved;
	}
	public void setIsAprroved(String isAprroved) {
		this.isAprroved = isAprroved;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	
	@Type(type="date")
	@JsonSerialize(using=DateStringSerializer.class)
	@JsonDeserialize(using=DateStringDeserializer.class)
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public int getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(int modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	@Type(type="date")
	@JsonSerialize(using=DateStringSerializer.class)
	@JsonDeserialize(using=DateStringDeserializer.class)
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	@Column(name = "lastName", nullable = false)
	private String lastName;
	 @Column(name = "emailId", nullable = false)
	private String emailId;
	 @Column(name = "prnNumber", nullable = false)
	private String prnNumber;
	 @Column(name = "password", nullable = false)
	private String password;
	 @Column(name = "confPassword", nullable = false)
	private String confPassword;
	 @Column(name = "otpGenerated", nullable = false)
	private int  otpGenerated;
	 @Column(name = "otpEntered", nullable = false)
	private int  otpEntered;
	 @Column(name = "fatherName", nullable = false)
	private String fatherName; 
	 @Column(name = "grandFatherName", nullable = false)
	private String grandFatherName; 
	 @Column(name = "nationalId", nullable = false)
	 private String nationalId;
	 @Column(name = "mobileNumber", nullable = false)
	 private String mobileNumber; 
	 @Column(name = "isActive", nullable = false)
		private String isActive;
	 @Column(name = "isAprroved", nullable = false)
		private String isAprroved;
	 @Column(name = "createdBy", nullable = false)
		private int createdBy;	
	 @Column(name = "createdDate", nullable = false)
		private Date createdDate;	
	 @Column(name = "modifiedBy", nullable = false)
		private int modifiedBy;	
	 @Column(name = "modifiedDate", nullable = false)
		private Date modifiedDate;
		
		/*
		 * public LoginUserDetails(String firstName,String lastName, String emailId ,
		 * String password, String confPassword , int otpGenerated, int otpEntered,
		 * String fatherName, String grandFatherName , String nationalId, String
		 * mobileNumber , String isActive , String isAprroved, int createdBy , Date
		 * createdDate, int modifiedBy , Date modifiedDate ) { this.firstName =
		 * firstName; this.lastName = lastName ; this.emailId = emailId ; this.password
		 * = password ; this.confPassword = confPassword ; this.otpGenerated =
		 * otpGenerated ; this.otpEntered = otpEntered ; this.fatherName = fatherName ;
		 * this.grandFatherName = grandFatherName; this.nationalId = nationalId ;
		 * this.mobileNumber = mobileNumber ; this.isActive = isActive ; this.isAprroved
		 * = isAprroved ; this.createdBy = createdBy; this.createdDate = createdDate ;
		 * this.modifiedBy = modifiedBy ; this.modifiedDate = modifiedDate ; }
		 */
	  
}
