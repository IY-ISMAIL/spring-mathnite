package br.com.mathnite.spring.repository;

import br.com.mathnite.spring.model.Address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
