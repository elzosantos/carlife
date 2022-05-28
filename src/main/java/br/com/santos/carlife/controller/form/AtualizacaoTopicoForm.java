package br.com.santos.carlife.controller.form;

import javax.validation.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
/*
import br.com.santos.carlife.modelo.Topico;
import br.com.santos.carlife.repository.TopicoRepository;*/

public class AtualizacaoTopicoForm {

	@NotNull
	@NotEmpty
	private String titulo;
	@NotNull
	@NotEmpty
	private String mensagem;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	/*public Topico atualizar(Long id, TopicoRepository topicoRepository) {
		Topico topico = topicoRepository.getById(id);

		topico.setTitulo(this.titulo);
		topico.setMensagem(this.mensagem);
		return topico;
	}*/

}
