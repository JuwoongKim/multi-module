package modulesystem.application;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import modulesystem.domain.Member;
import modulesystem.domain.repository.MemberRepository;

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
