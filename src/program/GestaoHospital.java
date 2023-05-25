package program;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import entities.Paciente;


public class GestaoHospital {
	    private Queue<Paciente> filaSevero;
	    private Queue<Paciente> filaModerado;
	    private Queue<Paciente> filaLeve;
	    private Queue<Paciente> filaNormal;

	    public GestaoHospital() {
	        filaSevero = new LinkedList<>();
	        filaModerado = new LinkedList<>();
	        filaLeve = new LinkedList<>();
	        filaNormal = new LinkedList<>();
	    }

	    public void adicionarPaciente() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nome: ");
	        String nome = scanner.nextLine();

	        System.out.print("CPF: ");
	        String cpf = scanner.nextLine();

	        System.out.print("Nível de prioridade (0 - normal, 1 - leve, 2 - moderado, 3 - severo): ");
	        int prioridade = scanner.nextInt();

	        Paciente paciente = new Paciente(nome, cpf, prioridade);
	        switch (prioridade) {
	            case 0:
	                filaNormal.add(paciente);
	                break;
	            case 1:
	                filaLeve.add(paciente);
	                break;
	            case 2:
	                filaModerado.add(paciente);
	                break;
	            case 3:
	                filaSevero.add(paciente);
	                break;
	            default:
	                System.out.println("Prioridade não é inválida.");
	        }
	        System.out.println("Paciente adicionado à fila com sucesso.");
	    }

	    public void atenderProximoPaciente() {
	        if (!filaSevero.isEmpty()) {
	            Paciente paciente = filaSevero.poll();
	            System.out.println("Atendendo paciente severo: " + paciente.getNome());
	        } else if (!filaModerado.isEmpty()) {
	            Paciente paciente = filaModerado.poll();
	            System.out.println("Atendendo paciente moderado: " + paciente.getNome());
	        } else if (!filaLeve.isEmpty()) {
	            Paciente paciente = filaLeve.poll();
	            System.out.println("Atendendo paciente leve: " + paciente.getNome());
	        } else if (!filaNormal.isEmpty()) {
	            Paciente paciente = filaNormal.poll();
	            System.out.println("Atendendo paciente normal: " + paciente.getNome());
	        } else {
	            System.out.println("Não há pacientes na fila.");
	        }
	    }

	    public void exibirNumeroDePacientesNaFila() {
	        int total = filaSevero.size() + filaModerado.size() + filaLeve.size() + filaNormal.size();
	        System.out.println("Total de pacientes na fila: " + total);
	        System.out.println(" - Severo: " + filaSevero.size());
	        System.out.println(" - Moderado: " + filaModerado.size());
	        System.out.println(" - Leve: " + filaLeve.size());
	        System.out.println(" - Normal: " + filaNormal.size());
	    }
	}

