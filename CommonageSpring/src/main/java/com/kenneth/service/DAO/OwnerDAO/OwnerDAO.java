package com.kenneth.service.DAO.OwnerDAO;

import com.kenneth.model.Owner;

public interface OwnerDAO {

	public void updateOwner(Owner owner);
	
	public Owner getOwnerDetails(Owner owner);
	
	public boolean setOwnerDetails(Owner owner);
}
