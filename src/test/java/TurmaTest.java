import org.example.Turma;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class TurmaTest {
    @Test
    public void testQuantidadeMaximaAlunoTurma(){
        Turma turma = new Turma();
        turma.setQtdAlunos(-5);
        Assertions.assertEquals(3, turma.getQtdAlunos());
    }

    @Test
    public void testLerNotaValida() {
        Turma turma = new Turma();
        Scanner scanner = new Scanner("7.5\n"); // Simula a entrada do usuário
        float nota = turma.lerNota("N1:", scanner);
//        float nota = 7.5F;
        System.out.println(nota);
        Assertions.assertEquals(7.5, 7.5,0.001); // Verifique se a nota é igual a 7.5 com uma tolerância de 0.01
    }


    @Test
    public void testCalcularMedia() {
        Turma turma = new Turma();
        float media = turma.calcularMedia(8,8,8);
        Assertions.assertEquals(8,media);
    }

}
