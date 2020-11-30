package com.tuxcuiabano.brewer3.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tuxcuiabano.brewer3.model.Cerveja;
import com.tuxcuiabano.brewer3.model.Estilo;

@Repository
public interface Cervejas extends JpaRepository<Cerveja, Long>{
	


}
