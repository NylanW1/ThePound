package com.example.thepound;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Events")
public class Post extends ParseObject {
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";
    public static final String KEY_CREATED_AT = "createdAt";
    public static final String KEY_TITLE = "title";
    public static final String KEY_LIKES = "likeCount";

    public String getDescription() {
        return getString(KEY_DESCRIPTION);
    }

    public void setDescription(String description){
        put(KEY_DESCRIPTION, description);
    }

    public ParseFile getImage() {
        return getParseFile(KEY_IMAGE);
    }

    public void setImage(ParseFile parseFile) {
        put(KEY_IMAGE, parseFile);
    }

    public ParseUser getUser(){
        return getParseUser(KEY_USER);
    }

    public void setUser(ParseUser parseUser){
        put(KEY_USER, parseUser);
    }

    public String getTitle() {
        return getString(KEY_TITLE);
    }

    public void setTitle(String title){
        put(KEY_TITLE, title);
    }

    public Number getLikes() {
        return getNumber(KEY_LIKES);
    }

    public void addLike() {
        int currentLikes = getNumber(KEY_LIKES).intValue();
        currentLikes = currentLikes + 1;
        put(KEY_LIKES, currentLikes);
    }

    public void subtractLike() {
        int currentLikes = getNumber(KEY_LIKES).intValue();
        currentLikes = currentLikes - 1;
        put(KEY_LIKES, currentLikes);
    }

}
