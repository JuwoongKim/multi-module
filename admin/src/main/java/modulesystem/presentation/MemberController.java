package modulesystem.presentation;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import modulesystem.application.MemberService;
import modulesystem.domain.Member;

@Controller
@RequiredArgsConstructor
public class MemberController {
	private final MemberService memberService;

	@GetMapping("/admin/members")
	public String showMembers(Model model) {
		List<Member> members = memberService.getAll();
		model.addAttribute("members", members);
		return "member-list";
	}
}
