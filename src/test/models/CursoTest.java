package test.models;

import com.jdbcexample.objetos.Alumno;
import com.jdbcexample.objetos.Curso;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CursoTest {
    private Curso curso;

    @BeforeEach
    void init(){
        curso = new Curso("Matematica I");
        System.out.println("Esto se ejecuta siempre antes de cada test");
    }

    @Test
    public void testCreateCurso(){
        Curso curso = new Curso();
        Assertions.assertTrue(curso instanceof Curso);
    }

    @Test
    public void testSetNombre(){
        Curso curso = new Curso("Paradigmas");
        Assertions.assertEquals("Paradigmas", curso.getNombre());
    }
    @Test
    public void testNombreCurso(){
        Assertions.assertEquals("Matematica I", this.curso.getNombre());
    }

    @Test
    public void testAddAlumnoToCurso(){
        Alumno alumno = new Alumno();
        this.curso.addAlumno(alumno);
        Assertions.assertEquals(1, this.curso.getListadoAlumnos().size());
    }

}
