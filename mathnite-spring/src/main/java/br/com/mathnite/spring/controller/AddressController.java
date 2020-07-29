package br.com.mathnite.spring.controller;

import br.com.mathnite.spring.model.Address;
import br.com.mathnite.spring.model.User;
import br.com.mathnite.spring.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.beans.Transient;
import java.util.Optional;

@RequestMapping("/address")
@RestController
public class AddressController {
    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Address>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(addressService.findOne(id));
    }
    @PostMapping
    public ResponseEntity<Address> save(@RequestBody Address address) {
        return ResponseEntity.ok(addressService.save(address));
    }

    @Transactional
    @PutMapping("/{id}")
    public ResponseEntity<Address> update(@RequestBody Address address){
        return ResponseEntity.ok(addressService.update(address));
    }

    @Transactional
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        addressService.delete(id);
        return ResponseEntity.ok(null);
    }
}
