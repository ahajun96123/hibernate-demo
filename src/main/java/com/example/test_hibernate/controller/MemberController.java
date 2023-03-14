package com.example.test_hibernate.controller;

import com.example.test_hibernate.entity.MemberEntity;
import com.example.test_hibernate.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor
@RequestMapping("/v1") // API version
public class MemberController {
    private final MemberService memberService;

    /**
     * 멤버 조회
     */
    @GetMapping("members")
    public List<MemberEntity> findAllMember() {
        return memberService.findAll();
    }
    @GetMapping("member")
    public MemberEntity getMemberById(@RequestParam Long id) {
        return memberService.getUserById(id);
    }

    /**
     * 회원가입
     * body :
     * {
     *     "username" : "email",
     *     "name" : "name"
     * }
     */
    @PostMapping("member")
    public MemberEntity signUp(@RequestBody MemberEntity member) {
        return memberService.createMember(member);
    }
}
