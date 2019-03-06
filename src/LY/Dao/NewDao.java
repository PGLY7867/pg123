package LY.Dao;

import java.util.List;

import LY.Entity.New;

public interface NewDao {
	int add( New obj);
	List<New> selectAll();
}
