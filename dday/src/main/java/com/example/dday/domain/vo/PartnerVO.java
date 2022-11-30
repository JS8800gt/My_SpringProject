package com.example.dday.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class PartnerVO {
    private Long partnerNumber;
    private String partnerStoreName;
    private String partnerRegistrationNumber;
    private String partnerOwnerName;
    private String partnerOwnerEmail;
    private String partnerStoreAddress;
    private String partnerOwnerPhoneNumber;
    private String memberNumber;

    public void create(String partnerStoreName, String partnerRegistrationNumber, String partnerOwnerName, String partnerOwnerEmail, String partnerStoreAddress, String partnerOwnerPhoneNumber) {
        this.partnerStoreName = partnerStoreName;
        this.partnerRegistrationNumber = partnerRegistrationNumber;
        this.partnerOwnerName = partnerOwnerName;
        this.partnerOwnerEmail = partnerOwnerEmail;
        this.partnerStoreAddress = partnerStoreAddress;
        this.partnerOwnerPhoneNumber = partnerOwnerPhoneNumber;
    }
}
