package com.example.hongparkhelloworld.dto;

import com.example.hongparkhelloworld.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@ToString
public class ArticleForm {

    private String title;
    private String content;

    public Article toEntity() {
        return new Article(null, title, content);
    }


//    public ArticleForm(String title, String content) {
//        this.title = title;
//        this.content = content;
//    }  @AllArgsConstructor

//    @Override
//    public String toString() {
//        return "ArticleForm{" +
//                "title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    } @ToString

}
