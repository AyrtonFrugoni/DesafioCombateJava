import java.util.Scanner;

public class CombatGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do primeiro campeão:");
		String name1 = sc.nextLine();
		System.out.println("Digite a quantidade de vida do primeiro campeão:");
		int life1 = sc.nextInt();
		System.out.println("Digite a quantidade de ataque do primeiro campeão:");
		int attack1 = sc.nextInt();
		System.out.println("Digite a quantidade de armadura do primeiro campeão:");
		int armor1 = sc.nextInt();
		
		sc.nextLine(); // Consumindo a quebra de linha pendente.
		System.out.println();

		System.out.println("Digite o nome do segundo campeão:");
		String name2 = sc.nextLine();
		System.out.println("Digite a quantidade de vida do segundo campeão:");
		int life2 = sc.nextInt();
		System.out.println("Digite a quantidade de ataque do segundo campeão:");
		int attack2 = sc.nextInt();
		System.out.println("Digite a quantidade de armadura do segundo campeão:");
		int armor2 = sc.nextInt();
		sc.nextLine();
		Champion champion1 = new Champion(name1, life1, attack1, armor1);
		Champion champion2 = new Champion(name2, life2, attack2, armor2);

		System.out.println("Quantos turnos deseja executar?");
		int numTurns = sc.nextInt();

		for (int turn = 1; turn <= numTurns; turn++) {

			champion1.takeDamage(champion2.getAttack());
			champion2.takeDamage(champion1.getAttack());
			
			System.out.println();
			System.out.println("Resultado do turno " + turn + ":");
			System.out.println(champion1.getStatus());
			System.out.println(champion2.getStatus());

			if (champion1.isDead() || champion2.isDead()) {
				break;
			}
		}
		System.out.println();
		System.out.println("FIM DO COMBATE");

		sc.close();

	}
}
