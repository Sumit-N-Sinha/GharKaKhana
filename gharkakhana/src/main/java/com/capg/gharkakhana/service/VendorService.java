package com.capg.gharkakhana.service;

import com.capg.gharkakhana.entity.Vendor;

public interface VendorService {

	Vendor getVendorById(int vid);

	Vendor createvendor(Vendor vendor);

	void deletevendor(int vid);

}
