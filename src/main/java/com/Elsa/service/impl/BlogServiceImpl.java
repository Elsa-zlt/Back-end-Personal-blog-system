package com.Elsa.service.impl;

import com.Elsa.entity.Blog;
import com.Elsa.mapper.BlogMapper;
import com.Elsa.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author：Elsa_zlt
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
