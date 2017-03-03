package com.yundata.web;

import com.yundata.metadata.dao.mapper.UserInfoPOMapper;
import com.yundata.metadata.model.po.UserInfoPO;
//import com.yundata.service.IRedisService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 2 on 2017/3/1.
 */
@Controller
public class myController {
    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    UserInfoPOMapper userInfoPOMapper;

    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public String login(HttpServletRequest request, HttpSession session) {
        List<UserInfoPO> userInfoPOList = null;
        UserInfoPO userInfoPO = userInfoPOMapper.selectByPrimaryKey("test001");
        userInfoPOList.add(userInfoPO);
        session.setAttribute("user", userInfoPO);
        return "index";
    }

    @RequestMapping(value = "/look", method = RequestMethod.GET)
    public String look(HttpSession session) {
        UserInfoPO userInfoPO = (UserInfoPO) session.getAttribute("user");
        logger.info(userInfoPO.getUserInfoId());
        return "index";
    }
}
