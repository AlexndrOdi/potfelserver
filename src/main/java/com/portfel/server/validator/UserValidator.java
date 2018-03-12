package com.portfel.server.validator;

import com.portfel.server.entity.User;
import com.portfel.server.service.security.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator{

    @Autowired
    private UserService userService;

    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    public void validate(Object target, Errors errors) {
        User user = (User) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "Required");

        if (user.getUsername().length()<6 || user.getUsername().length()>32){
            errors.rejectValue("username", "length is wrong");
        }

        if (userService.findByUserName(user.getUsername())!=null){
            errors.rejectValue("username", "this name already exists");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"password", "Required");
        if (user.getPassword().length()<6 || user.getPassword().length()>32){
            errors.rejectValue("password", "length is wrong");
        }

        if (!user.getConfirmPassword().equals(user.getPassword())){
            errors.rejectValue("confirmPassword", "Confirm password is wrong");
        }
    }
}
