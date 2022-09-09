package com.example.Redisdemo.entity;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Product")
@Getter
@Setter
public class Product implements Serializable {
	//private static final long serialVersionUID = 2831820523987972058L;
    @Id
    private int id;
    private String name;
    private int qty;
    private long price;
	
	
}
