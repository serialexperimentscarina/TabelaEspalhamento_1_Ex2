package view;

import javax.swing.JOptionPane;

import controller.TabelaMoradorController;
import model.Morador;

public class Principal {

	public static void main(String[] args) {
		TabelaMoradorController tabela = new TabelaMoradorController(10);
		String input = "", nome, modelo, cor, placa;
		int numApto, andar;

		do {
			try {
				input = JOptionPane.showInputDialog("MENU: \n1 - Adicionar morador \n2 - Remover morador \n3 - Buscar morador \n4 - Listar moradores de um andar \n5 - Sair", "");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Encerrando.");
					System.exit(0);
				} else {
					switch (input) {
					
					case("1"):
						do {
							numApto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do apto: "));
							if (numApto < 100 || numApto > 1999) {
								JOptionPane.showMessageDialog(null, "Número de apartamento inválido, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
							}
						} while (numApto < 100 || numApto > 1999);
						nome = JOptionPane.showInputDialog("Digite o nome do morador: ");
						modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ");
						cor = JOptionPane.showInputDialog("Digite a cor do carro: ");
						placa = JOptionPane.showInputDialog("Digite a placa do carro: ");
						tabela.adiciona(new Morador(numApto, nome, modelo, cor, placa));
						break;
						
					case("2"):
						do {
							numApto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do apto: "));
							if (numApto < 100 || numApto > 1999) {
								JOptionPane.showMessageDialog(null, "Número de apartamento inválido, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
							}
						} while (numApto < 100 || numApto > 1999);
						nome = JOptionPane.showInputDialog("Digite o nome do morador: ");
						tabela.remove(new Morador(numApto, nome, null, null, null));
						break;
						
					case("3"):
						do {
							numApto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do apto: "));
							if (numApto < 100 || numApto > 1999) {
								JOptionPane.showMessageDialog(null, "Número de apartamento inválido, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
							}
						} while (numApto < 100 || numApto > 1999);
						nome = JOptionPane.showInputDialog("Digite o nome do morador: ");
						Morador moradorBuscado = tabela.busca(new Morador(numApto, nome, null, null, null));
						
						if(moradorBuscado != null) {
							JOptionPane.showMessageDialog(null, moradorBuscado);
						} else {
							JOptionPane.showMessageDialog(null, "Morador não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
						}
						break;
						
					case("4"):
						do {
							andar = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do andar: "));
							if (andar < 1 || andar > 10) {
								JOptionPane.showMessageDialog(null, "Andar inválido, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
							}
						} while (andar < 1 || andar > 10);
						tabela.lista(andar);
						break;
						
					case("5"):
						JOptionPane.showMessageDialog(null, "Encerrando.");
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opção não reconhecida", "Erro", JOptionPane.ERROR_MESSAGE);
						break;
					}
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Houve um erro durante a execução", "Erro", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
		} while (!input.equals("5"));
	}
}
