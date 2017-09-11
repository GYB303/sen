package com.github.weChart.controller;

import net.sf.json.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RequestMapping(value = "api/test", produces = {APPLICATION_JSON_UTF8_VALUE})
@Controller
@Api(value = "api/test", tags = "TestApi", description = "接口测试")
public class IndexController {


    @ApiOperation(value = "接口测试", response = JSONObject.class, responseContainer = "list")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity getAllDepartments() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","Tom");
        jsonObject.put("sex","male");
        return new ResponseEntity(jsonObject, HttpStatus.OK);
    }
}
