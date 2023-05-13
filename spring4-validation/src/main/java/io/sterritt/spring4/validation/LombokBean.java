package io.sterritt.spring4.validation;

import lombok.*;

import java.util.List;

//@Builder
public class LombokBean {
    @Getter  @NonNull
    private String name;

    @Getter @NonNull
    private String address;

    public void setAddress(String address) {
        if (address.isEmpty()) {
            throw new IllegalArgumentException("expecting non-null address");
        }
        this.address = address;
    }

    public void setName(String name) {
        if (address.isEmpty()) {
            throw new IllegalArgumentException("expecting name");
        }
        this.name = name;
    }
}
