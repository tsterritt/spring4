package io.sterritt.spring4.validation;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

public class HibernateBean {

    @NotEmpty @Getter @Setter
    private String name;

    @NotEmpty @Getter @Setter
    private String address;
}
