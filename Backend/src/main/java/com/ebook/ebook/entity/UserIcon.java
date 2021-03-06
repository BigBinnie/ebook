package com.ebook.ebook.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;

@Document(collection = "usericon")
public class UserIcon {
    @Id
    private int id;

    @Field(name="iconBase64")
    private String iconBase64;

    public UserIcon(int id,String iconBase64){
        this.id =id;
        this.iconBase64=iconBase64;
    }

    public String getIconBase64() {
        return iconBase64;
    }

    public void setIconBase64(String iconBase64) {
        this.iconBase64 = iconBase64;
    }
}

