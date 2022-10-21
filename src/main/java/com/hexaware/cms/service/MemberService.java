package com.hexaware.cms.service;

import java.util.List;

import com.hexaware.cms.entity.Member;

public interface MemberService {
	public List<Member> findAllMembers();
	public Member findMemberById(Long memberId);
	public void deleteMemberById(Long memberId);
	public Member saveMember(Member member);
	public int updateMember(Member member,Long memberId);
	public List<Member> findByMemberName(String memberName);

}
