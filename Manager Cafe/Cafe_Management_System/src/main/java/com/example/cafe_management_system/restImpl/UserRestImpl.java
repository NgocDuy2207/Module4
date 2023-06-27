package com.example.cafe_management_system.restImpl;

import com.example.cafe_management_system.constents.CafeConstants;
import com.example.cafe_management_system.rest.UserRest;
import com.example.cafe_management_system.service.UserService;
import com.example.cafe_management_system.ustils.CafeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.Map;
@Controller
public class UserRestImpl implements UserRest {
    @Autowired
    private UserService userService;
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
       try {
           return userService.signUp(requestMap);

       }catch (Exception ex){
           ex.printStackTrace();
       }
       return CafeUtils.getResponseEntity(CafeConstants.SOME_THING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
