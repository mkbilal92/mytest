package com.example.test.Controller;

import com.example.test.DTO.StudentDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mycontroller")
public class MyController {

    String data=  "";

    @GetMapping("/")
    public String hello(){
        return this.data;
    }

    @PostMapping("/")
    public String helloPost(@RequestBody StudentDTO student){
        return this.data = student.getName();
    }

    @PutMapping("/")
    public  String helloput(@RequestBody StudentDTO studentDTO){
        if (this.data.isEmpty()){
            return "data is not post,please post data";
        }
        return  this.data=studentDTO.getName();
    }

    @DeleteMapping("/")
    public String helloDelete(@RequestBody StudentDTO studentDTO)
    {
        return this.data = null;
    }





}
