package com.hzz.project.service;


import com.hzz.project.po.blog.Blog;

import java.util.List;


public interface BlogService {

    //提交博文
    public void insertBlog(Blog blog);

    //更新修改时间
    public void updateAlterTime(Integer id, Blog blog);

    //通过id查找博文
    public Blog getBlogById(Integer id);

    //通过标题查找博文
    public Blog getBlogByTitle(String title);

    //寻找所有博文
    public List<Blog> getAllBlog();

}
