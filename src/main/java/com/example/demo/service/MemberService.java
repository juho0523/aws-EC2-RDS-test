package com.example.demo.service;


import org.springframework.stereotype.Service;

import com.example.demo.repository.MemberRepository;
import com.example.demo.entity.Member;


@Service
public class MemberService {

    private final MemberRepository repository;

    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }

    public Member save(Member member) {
        return repository.save(member);
    }
}