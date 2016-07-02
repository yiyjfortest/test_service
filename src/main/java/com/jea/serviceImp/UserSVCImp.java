package com.jea.serviceImp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jea.dao.UserInfoMapper;
import com.jea.po.UserInfo;
import com.jea.po.UserInfoExample;
import com.jea.po.UserInfoExample.Criteria;
import com.jea.service.UserSVC;
import com.jea.vo.UserVO;

@Service("userService")
public class UserSVCImp implements UserSVC {
	
	@Resource
	private UserInfoMapper userInfoMapper;
	
	public boolean hasMathUser(String userName, String password) throws Exception{
		UserInfoExample example = new UserInfoExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUserNameEqualTo(userName).andUserPasswordEqualTo(password);
		List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
		if (userInfos.isEmpty() || userInfos.size()!=1) {
			return false;
		}
		return true;
	}

	public UserVO findUserByUserName(String userName) throws Exception {
		UserInfoExample example = new UserInfoExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUserNameEqualTo(userName);
		List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
		if (userInfos.isEmpty()) {
			throw new Exception("该用户不存在");
		}else if (userInfos.size()!=1) {
			throw new Exception("数据库出错");
		}
		UserInfo userInfo = userInfos.get(0);
		UserVO userVO = userInfo2userVO(userInfo);
		return userVO;
	}
	
	private UserVO userInfo2userVO(UserInfo userInfo){
		UserVO userVO = new UserVO();
		userVO.setUserId(userInfo.getUserId());
		userVO.setUserName(userInfo.getUserName());
		userVO.setUserPassword(userInfo.getUserPassword());
		userVO.setCreateTime(userInfo.getCreatTime());
		userVO.setUserInfocol(userInfo.getUserInfocol());
		
		return userVO;
	}

}
