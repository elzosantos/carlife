package br.com.santos.carlife.repository;

import org.springframework.data.jpa.repository.JpaRepository;

 
import br.com.santos.carlife.modelo.Marca; 

public interface MarcaRepository extends JpaRepository<Marca, Long> {

	Marca findByNomeMarca(String nomeMarca);

}
