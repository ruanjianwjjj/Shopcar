package com.wjj.dao;

import com.wjj.entity.Gtype;

public interface GtypeMapper {
	//��
	public void addGtype(Gtype gtype);
	//ɾ
	public void deleteGtype(int typeid);
	//��
	public void updateGtype(Gtype gtype);
	//��
	public void selectGtype(Gtype gtype);
	
}
