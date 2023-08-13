package com.example.bapo.controller;

import com.example.bapo.domain.repository.MemberDao;
import com.example.bapo.dto.SignUpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    private final MemberDao memberDao;

    public MemberController(final MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @PostMapping("/members")
    public ResponseEntity<String> signUp(@RequestBody SignUpRequest request) {
        memberDao.addMember(request.toMember());
        // test입니다.
        return ResponseEntity.ok("OK!");
    }
}
