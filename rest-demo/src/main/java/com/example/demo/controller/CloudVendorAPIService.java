package com.example.demo.controller;


import com.example.demo.model.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService
{
    @GetMapping("{VendorID}")
    public CloudVendor getCloudVendorDetails(String vendorId)
    {
        return new CloudVendor("CV1" , "Vendor" , "Address one" , "#####");
    }
}
