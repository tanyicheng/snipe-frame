package org.snipe.modules.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.snipe.modules.system.SnipeEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "hello")
@RestController
public class HelloWorldController {

    @ApiOperation(value = "hello", notes = "hello 接口测试")
    @GetMapping("/hello")
    public String hello() {

        SnipeEntity se = new SnipeEntity();
        System.out.println(111111111);
        return "Hello, World!";
    }
}