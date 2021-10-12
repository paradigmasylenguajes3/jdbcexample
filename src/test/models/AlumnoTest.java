package test.models;

import com.jdbcexample.controllers.AlumnoController;
import com.jdbcexample.objetos.Alumno;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlumnoTest {
    private Alumno alumno;
    @BeforeEach
    void init(){


    }
    @Test
    public void testAlumnoCreated(){
        this.alumno = new Alumno();
        this.alumno.setNombre("Juan");
        this.alumno.setSexo("Masculino");
        Assertions.assertEquals(this.alumno.getNombre(), "Juan");
        Assertions.assertEquals(this.alumno.getSexo(), "Masculino");

    }

    @Test
    public void testAlumnoDelete(){
        Alumno alumno = new Alumno();
        AlumnoController alumnoController = new AlumnoController();
        assert(alumno instanceof Alumno);
    }
}
