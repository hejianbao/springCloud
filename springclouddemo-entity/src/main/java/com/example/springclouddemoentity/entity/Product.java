package com.example.springclouddemoentity.entity;

/**
 * @Classname Product
 * @Description TODO
 * @Date 2020/7/27 0027 9:53
 * @Author hejianbao
 * @Version HL
 */
public class Product {
    private String name;
    private int age;
    private String add;
    private String email;

    public Product() {
        this.name = "name";
        this.age = 12;
        this.add = "北京市历史互通";
        this.email = "6666.qq.com";
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", add='" + add + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
