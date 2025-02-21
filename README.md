# Projeto Sistema Bancário  

Fala, pessoal! Este é um projeto didático desenvolvido em Java para aplicar conceitos de Programação Orientada a Objetos (POO).  

## O que foi Utilizado  

- Classes e Objetos  
- Encapsulamento  
- Herança e Polimorfismo  
- Interfaces  
- Vetores para armazenamento de dados  

## Tecnologia utilizada  

- [Java](https://www.java.com/): linguagem de programação  

## Objetivo  

Criar um Sistema Bancário orientado a objetos, implementando diferentes tipos de conta e operações financeiras.  

## Estrutura do Projeto  

### Classes  

#### Conta (Abstrata)  
Classe base para todas as contas bancárias. Possui:  
- Número da conta  
- Saldo  
- Métodos de depósito e saque (o saque é abstrato para que as subclasses implementem)  

#### ContaCorrente  
Subclasse de `Conta`, que permite:  
- Saques dentro do saldo disponível e um limite de cheque especial  
- Implementação da interface `Transacao`, permitindo a realização de transações  

#### ContaPoupanca  
Subclasse de `Conta`, que adiciona:  
- Método para aplicar rendimento sobre o saldo  
- Restrição para saques apenas dentro do saldo disponível  

#### Transacao (Interface)  
Define a estrutura para operações financeiras, garantindo que qualquer classe que a implemente possa realizar transações.  

#### Cliente  
Classe que representa um cliente do banco. Possui:  
- Nome do cliente  
- Um conjunto de contas bancárias  
- Métodos para adicionar e listar contas associadas ao cliente  

#### Banco  
Gerencia clientes e contas do sistema, permitindo a execução das operações bancárias.  

#### Principal  
Classe responsável por iniciar o sistema bancário e executar suas funcionalidades.  

## Estudos  

- Fundamentos de Java  
- Princípios da Programação Orientada a Objetos (POO)  

