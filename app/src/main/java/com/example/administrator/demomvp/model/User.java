package com.example.administrator.demomvp.model;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Sanjay on 2016/3/17 on project DemoMvp.
 */
public class User {


    @IntDef(flag = true,
            value = {
                    GENDER_MALE,
                    GENDER_FEMALE
            })
    @Retention(RetentionPolicy.SOURCE)
    public @interface Gender {
    }

    public static final int GENDER_MALE = 1;
    public static final int GENDER_FEMALE = 2;


    private int gender;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(@Gender int gender) {
        this.gender = gender;
    }
}
