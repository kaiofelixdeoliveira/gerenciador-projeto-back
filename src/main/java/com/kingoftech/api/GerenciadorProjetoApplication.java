package com.kingoftech.api;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.kingoftech.api.audity.FileRepository;
import com.kingoftech.api.entities.Usuarios;
import com.kingoftech.api.enums.PerfilEnum;
import com.kingoftech.api.repositories.UsuarioRepository;
import com.kingoftech.api.util.SenhaUtils;

@SpringBootApplication
@EnableJpaRepositories
public class GerenciadorProjetoApplication {


	@Resource
	FileRepository fileRepository;

	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorProjetoApplication.class, args);
	}

	
	/*@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {

			Usuarios usuario = new Usuarios();
			usuario.setNome("usuario");
			usuario.setEmail("usuario@email.com");
			usuario.setPerfil(PerfilEnum.ROLE_USUARIO);
			usuario.setSenha(SenhaUtils.gerarBCrypt("123456"));
			this.usuarioRepository.save(usuario);

			Usuarios admin = new Usuarios();
			admin.setNome("admin");
			admin.setEmail("admin@email.com");
			admin.setPerfil(PerfilEnum.ROLE_ADMIN);
			admin.setSenha(SenhaUtils.gerarBCrypt("123456"));
			this.usuarioRepository.save(admin);

			// File file = new File("Java Notes", "Java is awesome");
			// fileRepository.saveAndFlush(null);

			// file.setName("Linux Notes");
			// fileRepository.saveAndFlush(file);
		};
		
		}
		*/


}
