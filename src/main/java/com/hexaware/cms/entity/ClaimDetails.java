package com.hexaware.cms.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class ClaimDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "claim_id")
	private Long claimId;
	@Column(name = "claim_amount")
	private Long claimAmount;
	@Column(name = "claim_date")
	private String claimDate;
	@Column(name = "claim_status")
	private String claimStatus;
	@Column(name = "claim_bill_details")
	private String billDetails;
	@Column(name = "claim_documents")
	private String claimDocuments;
	@Column(name="claim_Type")
	private String claimType;
	
	public ClaimDetails() {
		
	}

	public ClaimDetails(Long claimId, Long claimAmount, String claimDate, String claimStatus, String billDetails,
			String claimDocuments,String claimType) {
		super();
		this.claimId = claimId;
		this.claimAmount = claimAmount;
		this.claimDate = claimDate;
		this.claimStatus = claimStatus;
		this.billDetails = billDetails;
		this.claimDocuments = claimDocuments;
		this.claimType=claimType;
	}

	public ClaimDetails(Long claimAmount, String claimDate, String claimStatus, String billDetails,
			String claimDocuments,String claimType) {
		super();
		this.claimAmount = claimAmount;
		this.claimDate = claimDate;
		this.claimStatus = claimStatus;
		this.billDetails = billDetails;
		this.claimDocuments = claimDocuments;
		this.claimType=claimType;
	}

	public Long getClaimId() {
		return claimId;
	}

	public void setClaimId(Long claimId) {
		this.claimId = claimId;
	}

	public Long getClaimAmount() {
		return claimAmount;
	}

	public void setClaimAmount(Long claimAmount) {
		this.claimAmount = claimAmount;
	}

	public String getClaimDate() {
		return claimDate;
	}

	public void setClaimDate(String claimDate) {
		this.claimDate = claimDate;
	}

	public String getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public String getBillDetails() {
		return billDetails;
	}

	public void setBillDetails(String billDetails) {
		this.billDetails = billDetails;
	}

	public String getClaimDocuments() {
		return claimDocuments;
	}

	public void setClaimDocuments(String claimDocuments) {
		this.claimDocuments = claimDocuments;
	}
	
	public String getClaimType()
	{
		return claimType;
	}
	
	public void setClaimType(String claimType)
	{
		this.claimType=claimType;
	}
	

}
