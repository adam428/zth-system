package com.example.zthsystem.simpleform.model;


import org.apache.catalina.User;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Objects;

@Entity
@Table(name = "Users_table")
public class UsersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer usersID;
    String email;
    String password;
    boolean baned;
    Integer permissionFK;

    public Integer getUsersID(){
        return usersID;
    }

    public void setUsersID(Integer usersID) {
        this.usersID = usersID;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getBaned(){
        return baned;
    }

    public void setBaned(boolean baned) {
        this.baned = baned;
    }

    public Integer getPermissionFK(){
        return permissionFK;
    }

    public void setPermissionFK(Integer permissionFK) {
        this.permissionFK = permissionFK;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersModel that = (UsersModel) o;
        return Objects.equals(usersID, that.usersID) && Objects.equals(email, that.email) && Objects.equals(password, that.password) && Objects.equals(baned, that.baned) && Objects.equals(permissionFK, that.permissionFK);
    }

    @Override
    public int hashCode(){
        return Objects.hash(usersID,email,password,baned,permissionFK);
    }

    @Override
    public String toString(){
        return "UsersModel{" +
                "usersID=" + usersID +
                "email=" + email +  '\'' +
                "baned=" + baned +  '\'' +
                "permissionFK=" + permissionFK + '\'' +
                '}';
    }
    }
