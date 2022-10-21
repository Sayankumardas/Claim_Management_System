package com.hexaware.cms.service;

import java.util.List;

import com.hexaware.cms.entity.PlanDetails;


public interface PlanDetailsService {
	public List<PlanDetails> findAllPlans();
	public PlanDetails findPlanById(Long planId);
	public void deletePlanById(Long planId);
	public PlanDetails savePlan(PlanDetails planDetails);
	public int updatePlan(PlanDetails planDetails,Long planId);
	public List<PlanDetails> findByPlanNameAndInsuredAmount(String planName,Long insuredAmount);
}
