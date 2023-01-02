package com.bee.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bee.entity.AccountInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface AccountMapper extends BaseMapper<AccountInfo> {

}
