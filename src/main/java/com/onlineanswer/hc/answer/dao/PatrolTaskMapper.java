package com.onlineanswer.hc.answer.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.onlineanswer.hc.answer.entity.PatrolTaskEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface PatrolTaskMapper extends BaseMapper<PatrolTaskEntity> {

    @Select("select * from t_patrol_task where id = #{id} and deleted_at is null")
    PatrolTaskEntity queryByIdAndDeletedAtIsNull(@Param("id") Integer id);
}
