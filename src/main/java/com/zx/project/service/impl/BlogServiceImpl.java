package com.hzz.project.service.impl;


import com.hzz.project.mapper.blog.BlogMapper;
import com.hzz.project.po.blog.Blog;
import com.hzz.project.po.blog.BlogExample;
import com.hzz.project.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;


@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public void insertBlog(Blog blog) {
        blog.setCreatetime(new Date());
        blog.setAltertime(new Date());
        blogMapper.insert(blog);
    }

    @Override
    public void updateAlterTime(Integer id, Blog blog) {
    }

    @Override
    public Blog getBlogById(Integer id) {
        blogMapper.selectByPrimaryKey(id);
        return blogMapper.selectByPrimaryKey(id);
    }

    @Override
    public Blog getBlogByTitle(String title) {
        return null;
    }

    @Override
    public List<Blog> getAllBlog() {
        BlogExample blogExample = new BlogExample();
        List<Blog> blogs = blogMapper.selectByExampleWithBLOBs(blogExample);
        return blogs;
    }
}
