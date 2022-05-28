package br.com.santos.carlife.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.santos.carlife.modelo.Carro; 

public interface CarroRepository extends JpaRepository<Carro, Long> {

	List<Carro> findByNomeCarro(String nomeCarro);  
	
	 @Query(nativeQuery = true, value ="SELECT c.id, c.data_criacao,  nome_carro, status, c.autor_id, marca_id, m.nome_marca FROM carlife.carro c left join carlife.marca m on m.id = c.marca_id LIMIT 50")
	List<Carro> findByCarroLimit();

}
