package com.example.demo.controller;
import java.util.Map;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController// このクラスがWebコントローラーであることを示します
public class LoginController {
	
	/*
	@Autowired
	UserRepository userRepository;
	@PostMapping("/login")
	public String postLogin(@RequestBody Map<String, String> credentials) {
	    String name = credentials.get("name");
	    String pass = credentials.get("pass");
	    User user = userRepository.findByUsernameAndPassword(name, pass);
	    if (user != null) {
	        return "200";
	    }
	    return "401";
	}
	*/
    @GetMapping("/") // ルートURL ("/") に対するGETリクエストを処理します
    public String redirectToIndex() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication(); // 現在のユーザーの認証情報を取得します
        if (authentication != null && authentication.isAuthenticated()) { // ユーザーがログインしている場合
            return "200";  // "/index"にリダイレクトします
        }
        return "401"; // ユーザーがログインしていない場合、"/login"にリダイレクトします
    }
}