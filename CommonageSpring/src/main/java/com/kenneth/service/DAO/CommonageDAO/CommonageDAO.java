package com.kenneth.service.DAO.CommonageDAO;

import com.kenneth.model.Commonage;

public interface CommonageDAO {
	
public void updateCommonage(Commonage commonage);
	
	public Commonage getCommonageDetails(Commonage commonage);
	
	public boolean setCommonageDetails(Commonage commonage);

}
