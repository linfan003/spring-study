package com.lf.demotest.contorller;

import com.lf.demotest.domain.User;
import com.lf.demotest.service.UserService;
import com.lf.domain.CommonResult;
import com.lf.enums.CommonEnumResult;
import com.lf.enums.ErrorMessageEnum;
import com.lf.exception.CommonException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author linfan
 * @Date 2020/12/14 11:12
 * @Version 1.0
 */
@RestController
public class ExceptionController {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionController.class);
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/getUserByIds2/{ids}")
    public CommonResult getUserByIds2(@PathVariable List ids){
        List<User> user = userService.getUserByIds(ids);
        logger.info("*****插入结果*****："+user);
        if(user.size()> 0){
            CommonResult result = new CommonResult(200, "查询成功", user);
            return result;
        }else{
            return new CommonResult(444,"没有对应记录,查询ID："+ids,null);
        }
    }
    @GetMapping(value = "/test/{id}")
    public CommonEnumResult test(@PathVariable("id") int id){
        if (id == 1) {
            return  CommonEnumResult.SUCCESS;
        }
        if (id == 2) {
            throw new CommonException(ErrorMessageEnum.SERVICE_CAN_NOT_BE_FOUND);
        } else {
            return CommonEnumResult.FAIL;
        }
    }
}
