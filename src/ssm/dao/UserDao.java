package ssm.dao;

import ssm.po.User;

public interface UserDao {
	
	//根据用户id查询用户信息
	public User findUserById(int id) throws Exception;

}
