package com.juwoong.modulesystem.application;

import org.springframework.stereotype.Service;

import com.juwoong.modulesystem.domain.Member;
import com.juwoong.modulesystem.domain.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {
	private final MemberRepository memberRepository;

	public Long create(String name, Integer age) {
		return memberRepository.save(new Member(name, age)).getId();
	}

	public Member get(Long id) {
		return memberRepository.findById(id).orElseThrow(() -> new RuntimeException());
	}
}
