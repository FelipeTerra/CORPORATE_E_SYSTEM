# Corporate Ecosystem 🏢

[![Java](https://img.shields.io/badge/Java-17-orange)](https://www.oracle.com/java/)
[![Focus](https://img.shields.io/badge/Focus-OOP%20Foundations-blue)](#)

## 📌 Sobre o Projeto
O **Corporate Ecosystem** é uma aplicação Java desenvolvida para gerenciar a estrutura organizacional básica de uma empresa. O projeto foca na gestão centralizada de departamentos e na manutenção de um registro de colaboradores, servindo como prova de conceito para o uso de Programação Orientada a Objetos (POO) e persistência de dados em arquivos planos.

Esta versão prioriza a estabilidade do núcleo do sistema e a integridade dos dados manipulados via interface de linha de comando.

## 🚀 Funcionalidades
- **Cadastro de Departamentos:** Registro de unidades organizacionais com identificadores únicos.
- **Gestão de Colaboradores:** Inclusão, listagem e remoção de funcionários.
- **Aplicação de Herança:** Diferenciação técnica entre tipos de colaboradores (ex: Gerentes e Operacionais).
- **Persistência em CSV:** Sistema de leitura e escrita para garantir que os dados não sejam perdidos ao fechar a aplicação.
- **Interface via Console:** Sistema de menus numéricos para navegação intuitiva no terminal.

## 🛠️ Tecnologias e Conceitos Aplicados
- **Linguagem:** Java 17
- **Paradigma:** Programação Orientada a Objetos.
    - **Encapsulamento:** Proteção dos atributos das entidades.
    - **Herança:** Reuso de código entre classes de colaboradores.
    - **Polimorfismo:** Tratamento genérico de diferentes tipos de funcionários em listas.
- **Armazenamento:** File I/O (Manipulação de arquivos CSV).
- **Versionamento:** Git com fluxo de trabalho profissional.

## 📂 Organização do Projeto
```text
src/
 ├── application/      # Classe Principal (Entry point)
 ├── entities/         # Modelagem das entidades (Department, Employee, etc)
 ├── persistence/      # Lógica de leitura e gravação de arquivos CSV
 └── util/             # Utilitários para formatação e entrada de dados