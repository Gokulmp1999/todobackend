//package com.example.todobackEnd.model;
//
//import jakarta.persistence.*;
//import org.springframework.security.core.GrantedAuthority;
//
//
//
//@Entity
//public class Authority implements GrantedAuthority {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String authority;
//
//    public void setAuthority(String authority) {
//        this.authority = authority;
//    }
//
//    public Authority() {
//    }
//
//    public Authority(String authority) {
//        this.authority = authority;
//    }
//    @ManyToOne
//    private User user;
//
//    @Override
//    public String getAuthority() {
//        return null;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//}
