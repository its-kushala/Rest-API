package com.example.demo.controller;


import com.example.demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService
{
    CloudVendor cloudVendor;

    @GetMapping("{VendorID}")
    public CloudVendor getCloudVendorDetails(String vendorId)
    {
        return cloudVendor;
                //new CloudVendor("CV1" , "Vendor" , "Address one" , "#####");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully";
    }
}
