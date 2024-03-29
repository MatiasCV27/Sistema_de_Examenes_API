package com.sistema.examenes;

import com.sistema.examenes.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SistemaExamenesBackendApplication implements CommandLineRunner {

	@Autowired
	public UsuarioService usuarioService;

	@Autowired
	public BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SistemaExamenesBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*try {
			Usuario usuario = new Usuario();
			usuario.setNombre("Matias");
			usuario.setApellido("Criollo Vigo");
			usuario.setUsername("Mackend");
			usuario.setPassword(bCryptPasswordEncoder.encode("12345"));
			usuario.setEmail("mackend@gmail.com");
			usuario.setTelefono("967354987");
			usuario.setPerfil("foto.png");

			Rol rol = new Rol();
			rol.setRolId(1L);
			rol.setNombre("ADMIN");

			Set<UsuarioRol> usuarioRoles = new HashSet<>();
			UsuarioRol usuarioRol = new UsuarioRol();
			usuarioRol.setRol(rol);
			usuarioRol.setUsuario(usuario);
			usuarioRoles.add(usuarioRol);

			Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);
			System.out.println(usuarioGuardado.getUsername());
		} catch (UsuarioFoundException exception) {
			exception.printStackTrace();
		}*/
	}
}
