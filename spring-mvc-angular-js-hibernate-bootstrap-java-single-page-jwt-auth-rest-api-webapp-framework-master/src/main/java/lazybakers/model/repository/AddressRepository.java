package lazybakers.model.repository;

import java.util.List;

import lazybakers.model.entity.Address;
import lazybakers.model.entity.User;

public interface AddressRepository {
	
	public Integer createAddress(int houseNo, String street, String city, String state, String pincode,
			User user);
	
	public Address getAddressById(int addressId);
	
	public List<Address> getAddressByUserId(int userId);
	

}
