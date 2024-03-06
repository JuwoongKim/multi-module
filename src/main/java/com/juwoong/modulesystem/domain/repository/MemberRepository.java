package com.juwoong.modulesystem.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juwoong.modulesystem.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
