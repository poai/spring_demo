package cn.com.zjf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.zjf.model.User;
import cn.com.zjf.util.Db;
@Service
public class UserService {
	@Autowired
	private Db db;
	
	/*Spring的声明式事物*/
	//@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED,timeout=2,readOnly=false,noRollbackFor={NumberFormatException.class})
	public void add(User user){
		
		db.update("insert into user(name)values(?)", new String[]{user.getName()});
		Integer.parseInt("ss");
	}
	
}
