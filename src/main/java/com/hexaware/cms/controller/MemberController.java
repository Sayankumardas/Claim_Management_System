package com.hexaware.cms.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hexaware.cms.entity.Member;
import com.hexaware.cms.service.MemberService;

import io.swagger.annotations.ApiParam;


@RestController
@RequestMapping("/ClaimManagementSystem")
public class MemberController {
	@Autowired
	MemberService memberService;
	
	@GetMapping("/getallmembers")
	public List<Member> getAllMembers(){
		return memberService.findAllMembers();
	}
	
	@GetMapping("/getmemberdetailsbymembername/{membername}")
	List<Member> getClaimdetailsByMemberName(
			@ApiParam (value="returns the member details with member name",required = true)
			@PathVariable("membername") String memberName){
		return memberService.findByMemberName(memberName);
	}
	
	@PostMapping("/addmember")
	public String saveMember(@RequestBody Member member) {
		return memberService.saveMember(member) + "member added Successfully";
	}
	
	@DeleteMapping("/deletemember/{memberid}")
	public String deleteMember(@PathVariable("memberid") Long memberId) {
		 memberService.deleteMemberById(memberId);
		 return "ClaimDetails Deleted Successfully";
	}
	
	@GetMapping("/getmember/{memberid}")
	public Member getMember(@PathVariable("memberid") Long memberId) {
		return memberService.findMemberById(memberId);
	}
	
	@PutMapping("/updatemember/{memberid}")
	public String Update(@RequestBody Member member,@PathVariable("memberid") Long memberId) {
		return memberService.updateMember(member, memberId) + " member updated successfully";
	}
	

}
