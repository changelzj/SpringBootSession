package lzj.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class WebController {

    @GetMapping("getsession")
    public String getsession(HttpSession session) {
        session.setAttribute("user","mujimuji");
        return session.getId();
    }
}


