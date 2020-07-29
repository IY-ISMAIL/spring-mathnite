package br.com.mathnite.spring.dto;

import br.com.mathnite.spring.model.Address;
import br.com.mathnite.spring.model.User;


public class UserDto {
    private Long id;
    private String name;
    private String email;
    private Address address;

    public UserDto( User user){
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.address = user.getAddress();


    }
    public UserDto() { }

    public Long getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


}
