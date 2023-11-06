package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Turma {
    private int qtdAlunos;
    private List<Aluno> alunos = new ArrayList<>();

    public void setQtdAlunos(int qtdAlunos) {
        if (qtdAlunos >= 0 && qtdAlunos <= 10) {
            this.qtdAlunos = qtdAlunos;
        } else {
            System.out.println("Número de alunos inválido. Deve ser entre 0 e 10.");
        }
    }

    public void cadastrarAlunos(Scanner scanner) {
        if (qtdAlunos == 0) {
            System.out.println("Número de alunos não definido.");
            return;
        }

        for (int j = 0; j < qtdAlunos; j++) {
            System.out.println("Aluno: " + (j + 1));
            float n1 = lerNota("N1:", scanner);
            float n2 = lerNota("N2:", scanner);
            float n3 = lerNota("N3:", scanner);
            float media = calcularMedia(n1, n2, n3);
            if (media < 7.0) {
                float n4 = lerNota("N4 (devido à média abaixo de 7):", scanner);
                // Remover a menor nota
                media = calcularMediaAposSubstituicao(n1, n2, n3, n4);
            }

            Aluno aluno = new Aluno("Aluno " + (j + 1), n1, n2, n3, media);
            alunos.add(aluno);
        }
    }

    public void mostrarMedias() {
        System.out.println("Média Geral dos Alunos");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + " ---------- " + aluno.getMedia());
        }
    }

    public float lerNota(String mensagem, Scanner scanner) {
        float nota;
        do {
            System.out.print(mensagem);
            nota = scanner.nextFloat();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Deve ser entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10);
        return nota;
    }

    public float calcularMedia(float n1, float n2, float n3) {
        return (n1 + n2 + n3) / 3;
    }

    public float calcularMediaAposSubstituicao(float n1, float n2, float n3, float n4) {
        float menorNota = Math.min(n1, Math.min(n2, n3));
        return (n1 + n2 + n3 - menorNota + n4) / 3;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }
}