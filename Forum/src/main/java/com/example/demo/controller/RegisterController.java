package com.example.demo.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController // このクラスがWebコントローラーであることを示します
public class RegisterController {

//    @PostMapping("/api/register")
//    public boolean registerUser(@RequestBody UserDto userDto) {
//        User existingUser = userService.findByUsername(userDto.getUsername());
//        if (existingUser != null) {
//            // 既に存在するユーザーがある場合はエラーレスポンスを返す
//            return false;
//        } else {
//            // 新しいユーザーを保存して成功レスポンスを返す
//        	userService.save(userDto);
//            return true;
//        }
//    }
}