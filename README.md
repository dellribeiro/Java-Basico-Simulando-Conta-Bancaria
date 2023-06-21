# Simulando Uma Conta Bancária Através Do Terminal/Console

Este projeto tem como objetivo exercitar os conceitos de sintaxe em Java, envolvendo a declaração de variáveis, entrada de dados via terminal e manipulação de strings. O programa irá receber informações de uma conta bancária e exibir uma mensagem personalizada com os dados fornecidos.

## Características da Conta Bancária

A conta bancária possui os seguintes atributos:

- **Número**: Inteiro que identifica o número da conta.
- **Agência**: Texto que representa o número da agência.
- **Nome do Cliente**: Texto que contém o nome do cliente.
- **Saldo**: Valor decimal que indica o saldo disponível na conta.

## Executando o Programa

Para executar o programa, siga as instruções abaixo:

1. Abra o terminal ou prompt de comando.
2. Navegue até o diretório do projeto ContaBanco.
3. Compile os arquivos Java executando o seguinte comando:

```
javac ContaTerminal.java
```

1. Execute o programa com o seguinte comando:

```
java ContaTerminal
```

1. O programa irá solicitar a entrada dos dados via terminal, exibindo mensagens com as informações a serem fornecidas.
2. Digite os valores solicitados e pressione ENTER para avançar para o próximo campo.
3. Após fornecer todas as informações, o programa exibirá uma mensagem personalizada com os dados da conta.

## Exemplo de Utilização

Aqui está um exemplo de utilização do programa:

```
Por favor, digite o número da Conta:
> 1021

Por favor, digite o número da Agencia:
> 067-8

Por favor, digite o  seu nome:
> JOAO

Por favor, digite o seu sobrenome:
> SILVA

Por favor, digite o saldo:
> 237.48

Olá JOAO SILVA, obrigado por criar uma conta em nosso banco. Sua agência é 067-8, conta 1021 e seu saldo R$ 237.48 já está disponível para saque.
```
