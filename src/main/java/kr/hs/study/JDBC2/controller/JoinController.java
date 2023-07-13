package kr.hs.study.JDBC2.controller;

import kr.hs.study.JDBC2.dto.MyUserDTO;
import kr.hs.study.JDBC2.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JoinController {
    @Autowired
    private MyUserService service;

    @GetMapping("/write")
    public String join() {
        return "write_form";
    }

    @PostMapping("/write_form")
    public  String write_form(MyUserDTO dto) {
        service.insert(dto);
        return "result";
    }
}
