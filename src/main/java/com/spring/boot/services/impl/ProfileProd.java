package com.spring.boot.services.impl;

import com.spring.boot.services.Interfaces.IProfile;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class ProfileProd implements IProfile {
    @Override
    public int sum(int a, int b) {
        System.out.println(ProfileProd.class.getName());
        return a+b;
    }
}
