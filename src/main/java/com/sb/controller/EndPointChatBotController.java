package com.sb.controller;


import org.springframework.web.bind.annotation.*;

// http://localhost:8080/api/chat/endPoint/hi
@RestController
@RequestMapping("api/chat")
public class EndPointChatBotController {

    @GetMapping(value = "endPoint/{message}")
    public String chatMethod(@PathVariable String message , @RequestParam String name , @RequestParam(name="loc") String location){
        return message+" hello "+name+" from"+location;
    }

}
