package test.models;

import com.jdbcexample.controllers.AlumnoController;
import com.jdbcexample.objetos.Alumno;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class AlumnoTest {
    private Alumno alumno;

    @Test
    public void testAlumnoCreated(){
        this.alumno = new Alumno();
        this.alumno.setNombre("Juan");
        this.alumno.setSexo("Masculino");
        Assertions.assertEquals("Juan", this.alumno.getNombre());
        Assertions.assertEquals("Masculino", this.alumno.getSexo());

    }

    @Test
    public void testAlumnoCheckInstance(){
        Alumno alumno = new Alumno();
        Assertions.assertTrue(alumno instanceof Alumno);
    }
}
