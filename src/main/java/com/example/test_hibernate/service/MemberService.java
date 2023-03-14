package com.example.test_hibernate.service;

import com.example.test_hibernate.entity.MemberEntity;
import com.example.test_hibernate.repo.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository userRepository;
    private final MemberRepository memberRepository;


    public MemberEntity getUserById(Long id) {
        Optional<MemberEntity> userOptional = userRepository.findById(id);
        return userOptional.orElse(null);
    }

    public List<MemberEntity> findAll() {
        return memberRepository.findAll();
    }

    public MemberEntity createMember(MemberEntity member) {
        return memberRepository.save(member);
    }
}