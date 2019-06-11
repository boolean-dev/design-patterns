package com.tao.patterns.ch11proxy.entity;

/**
 * @ClassName PersonImpl
 * @Descriiption 人物实现类
 * @Author yanjiantao
 * @Date 2019/6/10 10:51
 **/
public class PersonImpl implements Person {

    private String name;
    private String gender;
    private String interests;
    private int rating;
    private int ratingCount = 0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }

    @Override
    public int getHotRating() {
        if (ratingCount == 0) {
            return 0;
        }
        return rating / ratingCount;
    }

}
