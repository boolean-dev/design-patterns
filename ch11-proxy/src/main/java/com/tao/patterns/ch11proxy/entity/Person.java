package com.tao.patterns.ch11proxy.entity;

/**
 * @ClassName Person
 * @Descriiption 人员接口类
 * @Author yanjiantao
 * @Date 2019/6/10 10:42
 **/
public interface Person {

    /**
     * 获取名字
     * @return 名字
     */
    String getName();

    /**
     * 获取性别
     * @return 性别
     */
    String getGender();

    /**
     * 获取爱好
     * @return 爱好
     */
    String getInterests();

    /**
     * 获取热度
     * @return 热度
     */
    int getHotRating();

    /**
     * 设置名字
     */
    void setName(String name);

    /**
     * 设置性别
     */
    void setGender(String gender);

    /**
     * 设置爱好
     */
    void setInterests(String interests);

    /**
     * 设置热度
     */
    void setHotRating(int rating);
}
