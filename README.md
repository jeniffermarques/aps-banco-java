# Atividade Prática Supervisionada 
## Programação orientada à objetos

O objetivo desse projeto é criar um programa que segue os princípios de um banco, ou seja, o cliente pode abrir uma conta e movimenta-lá.

##### Os atributos de uma conta são: 
- Número de conta;
- Nome do dono;
- Saldo; 
- Crédito;
- Outros atributos necessários para criar uma conta.

##### Os métodos são: 
- Criar conta; 
- Depositar; 
- Sacar; 
- Verificar o saldo após cada operação;
- Imprimir dados da conta;
- Outros métodos criados para movimentação da conta.

##### Tipos de conta e seu respectivo crédito:
- Conta normal, crédito R$100,00;
- Conta poupança, crédito R$0;
- Conta cinco estrelas, crédito R$500,00;

Criei uma classe teste onde faço toda a manipulação da conta. Nesse programa existe um Menu de interação, onde dá pra fazer toda a movimentação da conta.

#### Exemplo de código: :
```java
public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja abrir uma conta?");
        System.out.print("Digite 1 para Sim e 2 para Não: ");
        int abrir = scanner.nextInt();

        if(abrir == 2) {
            System.out.println("Lamentamos por não criar sua conta!");
            return;
        } else if (abrir != 1) {
            System.out.println("Opção inválida!");
            return;
        }
```

A IDE utilizada para fazer o projeto foi o Inteliij, mas pode ser executado com a IDE Netbeans, Eclipse ou qualquer IDE que execute Java de sua preferência.

