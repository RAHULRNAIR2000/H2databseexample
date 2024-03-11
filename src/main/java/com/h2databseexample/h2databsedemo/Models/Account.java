//package com.h2databseexample.h2databsedemo.Models;
//
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.List;
//
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//public class Account {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE )
//    private Long  id;
//
//    private String email;
//    private String password;
//    private  String firstname;
//
//    @OneToMany(mappedBy = "account")
//    private List<Post> posts;
//}
