package modulesystem.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import modulesystem.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
