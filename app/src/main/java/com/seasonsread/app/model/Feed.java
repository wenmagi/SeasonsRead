package com.seasonsread.app.model;

import java.util.ArrayList;

/**
 * Created by ZhanTao on 1/9/15.
 */
public class Feed extends BaseModel{
    private String title;
    private String blog_name;
    private String createtime;
    private int article_id;
    private int type_id;
    private int hitnum;
    private int is_reserved;

    public static class GsonRequestData{
        public ArrayList<Feed> feeds;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBlog_name() {
        return blog_name;
    }

    public void setBlog_name(String blog_name) {
        this.blog_name = blog_name;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public int getHitnum() {
        return hitnum;
    }

    public void setHitnum(int hitnum) {
        this.hitnum = hitnum;
    }

    public int getIs_reserved() {
        return is_reserved;
    }

    public void setIs_reserved(int is_reserved) {
        this.is_reserved = is_reserved;
    }
}
