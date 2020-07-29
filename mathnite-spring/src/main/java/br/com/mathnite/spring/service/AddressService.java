package br.com.mathnite.spring.service;

import br.com.mathnite.spring.model.Address;
import br.com.mathnite.spring.model.User;
import br.com.mathnite.spring.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;


@Service
public class AddressService {
    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }

    public Optional<Address> findOne(long id) {
        return addressRepository.findById(id);
    }

    public Address save(Address address){

        return addressRepository.save(address);
    }

    public Address update(Address address) {
        Optional<Address> optionalAddress = this.findOne(address.getId());

        if (optionalAddress.isPresent()) {
            return this.save(address);
        } else {
            return null;
        }
    }

    public void delete(Long id) {
        Optional<Address> optionalAddress = this.findOne(id);

        if (optionalAddress.isPresent()) {
            addressRepository.deleteById(id);
        }
    }
}
