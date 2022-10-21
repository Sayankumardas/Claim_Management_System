package com.hexaware.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.cms.entity.Member;
import com.hexaware.cms.repository.MemberRepository;
@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	MemberRepository memberRepo;

	@Override
	public List<Member> findAllMembers() {
		return memberRepo.findAll();
	}

	@Override
	public Member findMemberById(Long memberId) {		
		return memberRepo.findById(memberId).get();
	}

	@Override
	public void deleteMemberById(Long memberId) {
		memberRepo.deleteById(memberId);
		
	}

	@Override
	public Member saveMember(Member member) {
		// TODO Auto-generated method stub
		return memberRepo.save(member);
	}

	@Override
	public int updateMember(Member member, Long memberId) {
		return 0;
	}

	@Override
	public List<Member> findByMemberName(String memberName) {
		// TODO Auto-generated method stub
		return memberRepo.findByMemberName(memberName);
	}

}
