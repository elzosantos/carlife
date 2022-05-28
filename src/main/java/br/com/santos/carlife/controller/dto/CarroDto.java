package br.com.santos.carlife.controller.dto;

import java.time.LocalDateTime;

import java.util.List;
import java.util.stream.Collectors;

import br.com.santos.carlife.modelo.Carro;
import br.com.santos.carlife.modelo.Marca;

public class CarroDto {
	private Long id;
	private String nomeCarro;
	private LocalDateTime dataCriacao;
<<<<<<< HEAD
g	
=======
	private Marca marca;
	private String baseForte;
>>>>>>> 2909a991fb4eaf0286ee325f2c7b16dc5a993f1a
 
	private String top;
	
	public CarroDto(Carro carro) {
		this.id = carro.getId();
		this.nomeCarro = carro.getNomeCarro();
		this.dataCriacao = carro.getDataCriacao();

	}

	public Long getId() {
		return id;
	}

	public String getNomeCarro() {
		return nomeCarro;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public static List<CarroDto> converter(List<Carro> carros) {

		return carros.stream().map(CarroDto::new).collect(Collectors.toList());
	}

}
