package program;
import program.GestaoHospital;
import java.util.Scanner;
		public class Main {
		    public static void main(String[] args) {
		        GestaoHospital gestaoHospital = new GestaoHospital();
		        Scanner scanner = new Scanner(System.in);
		        int opcao = -1;

		        while (opcao != 0) {
		            System.out.println("Escolha uma opção:");
		            System.out.println("1. Adicionar paciente à fila");
		            System.out.println("2. Atender próximo paciente");
		            System.out.println("3. Exibir número de pacientes na fila");
		            System.out.println("0. Sair");
		            System.out.print("Opção: ");
		            opcao = scanner.nextInt();

		            switch (opcao) {
		                case 1:
		                    gestaoHospital.adicionarPaciente();
		                    break;
		                case 2:
		                    gestaoHospital.atenderProximoPaciente();
		                    break;
		                case 3:
		                    gestaoHospital.exibirNumeroDePacientesNaFila();
		                    break;
		                case 0:
		                    System.out.println("Encerrando o programa.");
		                    break;
		                default:
		                    System.out.println("Opção inválida.");
		            }
		            System.out.println();
		        }
		    }
		
		






	}


