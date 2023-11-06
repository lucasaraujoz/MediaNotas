package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Turma turma = new Turma();

        int op;
        int QTD_ALUNOS = 0;

        while (true) {
            System.out.println(":::::::BEM VINDO AO SISTEMA DE NOTAS:::::::");
            System.out.println("::::::::MENU::::::::" +
                    "\n1-Cadastro da qntd de alunos" +
                    "\n2-Inserir notas para alunos" +
                    "\n3-Mostrar média dos alunos");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Insira a quantidade de alunos da turma (até 10):");
                    QTD_ALUNOS = scanner.nextInt();
                    turma.setQtdAlunos(QTD_ALUNOS);
                    break;
                case 2:
                    turma.cadastrarAlunos(scanner);
                    break;
                case 3:
                    turma.mostrarMedias();
                    break;
            }
        }
    }
}