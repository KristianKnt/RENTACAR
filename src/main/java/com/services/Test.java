package com.services;
//
//import javax.persistence.EntityManager;
//
//import com.model.Sensor;
//import com.services.JPAUtil;

import com.model.Carro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/*public class Test {



	public static void main(String[] args) {

    /*    EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

        Sensor clima = new Sensor();

        clima.setTemperature("32°");
        clima.setHumidity("45%");
        clima.setCity("Prueba 2");

        entity.getTransaction().begin();
        entity.persist(clima);asdfasdf
        entity.getTransaction().commit();

	}

}*/
@SpringBootApplication
public class Test implements CommandLineRunner{
    

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public static void main( String[] args ) {
        SpringApplication.run(Test.class,args);
    }
    
    @Override
    public void run(String... args) throws Exception {

        // DataSourceConfig conection = new DataSourceConfig();
        // System.out.println(conection);
        Carro carro = new Carro();
        carro.setMarca("Chavrolet"); 
        carro.setModelo("Aveo");
        carro.setPlaca("AFS234");

        jdbcTemplate.query("INSERT INTO CARRO (PLACA, MARCA, MODELO) VALUES ('DGDG3535','CHEVROLET','AVEO')",BeanPropertyRowMapper.newInstance(Carro.class));
    }



}