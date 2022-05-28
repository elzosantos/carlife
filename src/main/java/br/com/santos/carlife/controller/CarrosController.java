package br.com.santos.carlife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.santos.carlife.controller.dto.CarroDto;
import br.com.santos.carlife.modelo.Carro;
import br.com.santos.carlife.repository.CarroRepository;

@RestController
@RequestMapping("/carros")
public class CarrosController {

	@Autowired
	private CarroRepository carroRepository;

	@GetMapping
	public List<CarroDto> lista(String nomeCarro) {
		if (nomeCarro == null) {
			List<Carro> carros = carroRepository.findByCarroLimit();

			return CarroDto.converter(carros);

		} else {
			List<Carro> carros = carroRepository.findByNomeCarro(nomeCarro);

			return CarroDto.converter(carros);
		}

	}
}
