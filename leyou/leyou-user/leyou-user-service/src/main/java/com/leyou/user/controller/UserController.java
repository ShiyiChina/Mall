package com.leyou.user.controller;


import com.leyou.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("check/{data}/{type}")
    public ResponseEntity<Boolean> checkUserData(@PathVariable("data")String data, @PathVariable("type")Integer type){

        Boolean state = userService.checkUserData(data,type);
        if (state == null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(state);
    }

}
