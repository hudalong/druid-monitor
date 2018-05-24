package com.alibaba.druid.monitor.support;


import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by qibaichao on 2016/9/7.
 * 异常处理
 */
public class ExceptionHandlerResolver implements HandlerExceptionResolver {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandlerResolver.class);

    
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            Map<String,String> returnData = new HashMap<String, String>();
            returnData.put("status","-1");
            returnData.put("message",ex.getMessage());
            String json = JSON.toJSONString(returnData);
            assert json != null;
            writer.write(json);
            writer.flush();
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }
}

