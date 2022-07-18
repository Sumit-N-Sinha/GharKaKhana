package com.capg.gharkakhana.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capg.gharkakhana.entity.Vendor;
import com.capg.gharkakhana.repository.VendorRepository;
@Service
public class VendorServiceImpl implements VendorService{
	@Autowired
	private VendorRepository vendorRepository;
	public Vendor createvendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}
	public void deletevendor(int vid) {
    	Optional<Vendor> optionalVendor= vendorRepository.findById(vid);
    	if(optionalVendor.isPresent()) {
    		vendorRepository.deleteById(vid);
    	}
	}
    	public Vendor getVendorById(int vid) {
    		Optional<Vendor> optionalVendor= vendorRepository.findById(vid);
        	if(optionalVendor.isPresent()) {
        		return optionalVendor.get();
        	}
        	else {
        		return null;
        	}
		
   	}
        public void updatevendor(Vendor newVendor, int vid) {
       
        }
		
     

}
