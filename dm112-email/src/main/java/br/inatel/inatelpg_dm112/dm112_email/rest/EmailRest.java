package br.inatel.inatelpg_dm112.dm112_email.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.inatel.inatelpg_dm112.dm112_email.service.EmailService;

@RestController
@RequestMapping("/mailapi")
public class EmailRest {

	@Autowired
	private EmailService emailService;

	@PostMapping("/enviar")
	public String enviarEmail(@RequestParam String para, @RequestParam String assunto, @RequestParam String texto) {
		emailService.enviarEmail(para, assunto, texto);
		return "E-mail enviado com sucesso!";
	}
}