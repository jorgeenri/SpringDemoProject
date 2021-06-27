package idat.edu.pe.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication //anotaciones
public class MiPrimerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiPrimerDemoApplication.class, args);
		System.out.println("Arrancando aplicacion en tomcat embebido");
	}

}
