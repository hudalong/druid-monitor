package com.alibaba.druid.monitor.dao;

import com.alibaba.druid.monitor.entity.App;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AppMapper {

    int addApp(@Param("app") App app);

    App queryByID(@Param("id")Integer id);

    List<App> getAll();

}
