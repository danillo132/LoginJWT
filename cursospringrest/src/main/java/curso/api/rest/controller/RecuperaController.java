package curso.api.rest.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import curso.api.rest.ObjetoErro;
import curso.api.rest.model.Usuario;
import curso.api.rest.repository.UsuarioRepository;
import curso.api.rest.service.EnviaEmailService;
import net.bytebuddy.agent.builder.AgentBuilder.FallbackStrategy.Simple;

@RestController
@RequestMapping(value = "/recuperar")
public class RecuperaController {

	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private EnviaEmailService emailService;
	
	@ResponseBody
	@GetMapping(value = "/")
	public void recuperar() throws Exception{
		
		
			
			emailService.enviarEmail("Recuperação de senha", "danillosantiago32@gmail.com", "Sua nova senha é: " + "123");
			
			
	}
}
