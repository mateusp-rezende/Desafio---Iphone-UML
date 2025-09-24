# Desafio DIO: Modelagem e Implementação de um iPhone (POO)

<img width="643" height="683" alt="image" src="https://github.com/user-attachments/assets/9f0124f5-381e-4204-bb9e-eeaba2b8c249" />


## 🚀 Visão Geral do Projeto

Este repositório contém a solução para o desafio de Programação Orientada a Objetos (POO) da trilha Java Básico da **Digital Innovation One (DIO)**. O objetivo foi modelar o dispositivo iPhone, garantindo que ele possa executar seus três papéis centrais: **Reprodutor Musical**, **Aparelho Telefônico** e **Navegador na Internet**, utilizando o princípio de **Interfaces**.

---

## 💡 Solução em POO: Interfaces e Implementação

A arquitetura do projeto foi baseada na separação de responsabilidades (Single Responsibility Principle) através do uso de **Interfaces**.

A classe concreta `iPhone` atua como o dispositivo que **implementa** (`implements`) os contratos definidos pelas interfaces, garantindo que ela cumpra todas as funcionalidades exigidas.

### 1. Modelagem UML (Diagrama de Classes)

O diagrama de classes demonstra a relação de **Implementação (Realização)** e as **Dependências** (o uso de outras classes, como `ListaDeContatos` e `Musicas`) dentro do sistema.

[**DICA:** *Insira aqui a imagem do seu diagrama UML finalizado.*]

### 2. Estrutura de Classes e Interfaces

| Tipo | Nome do Arquivo | Função / Papel |
| :--- | :--- | :--- |
| **Classe Principal** | `iPhone.java` | Implementa os três contratos (Interfaces) e contém a lógica principal de execução. |
| **Interface** | `ReprodutorMusical.java` | Contrato para métodos de áudio (`tocar`, `pausar`, etc.). |
| **Interface** | `AparelhoTelefonico.java` | Contrato para métodos de chamada (`ligar`, `atender`, etc.). |
| **Interface** | `NavegadorInternet.java` | Contrato para métodos web (`exibirPagina`, `adicionarNovaAba`, etc.). |
| **Dependência** | `ListaDeContatos.java` | Classe auxiliar usada pelo Aparelho Telefônico. |
| **Dependência** | `Musicas.java` | Classe auxiliar usada pelo Reprodutor Musical. |

---

## 🛠️ Como Compilar e Testar

Para testar a aplicação em sua máquina:

1.  Navegue até o diretório do projeto no terminal.
2.  Compile todos os arquivos Java com o comando `javac *.java`.
3.  Execute a classe principal com o comando `java iPhone`.

A rotina de testes (método `main`) simulará a inicialização do iPhone e a execução sequencial das suas três principais funcionalidades.

---

*Feito com ☕ e POO.*

