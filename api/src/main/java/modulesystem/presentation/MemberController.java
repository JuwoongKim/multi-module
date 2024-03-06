package modulesystem.presentation;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import modulesystem.application.MemberService;
import modulesystem.domain.Member;
import modulesystem.presentation.request.Create;

@RestController
@RequiredArgsConstructor
public class MemberController {
	private final MemberService memberService;

	@PostMapping(value = "/members")
	@ResponseStatus(HttpStatus.CREATED)
	public Long createMember(@RequestBody Create request) {
		return memberService.create(request.name(), request.age());
	}

	@GetMapping("/members/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Member getMember(@PathVariable Long id) {
		return memberService.get(id);
	}
}
