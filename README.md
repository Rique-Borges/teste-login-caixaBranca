# Projeto Tela de Login com Banco de Dados

Este projeto consiste em uma tela de login desenvolvida em Java que se conecta a um banco de dados MySQL. Os usuários podem fazer login com um nome de usuário e senha, além de adicionar novos usuários ao banco de dados. O objetivo é criar uma interface gráfica que permita a autenticação e a gestão de usuários de forma eficiente e segura.

## Pré-requisitos

- **Linguagem:** Java
- **Bibliotecas:** JUnit para testes unitários, JDBC para conexão com o banco de dados MySQL
- **IDE:** Eclipse

## Estrutura do Projeto

### Classes

- **User:** Esta classe representa o usuário e contém métodos para conectar ao banco de dados e verificar as credenciais dos usuários.
  - **Métodos:**
    - `public Connection conectarBD()`: Estabelece a conexão com o banco de dados.
    - `public boolean verificarUsuario(String login, String senha)`: Verifica as credenciais do usuário no banco de dados.

## Documentação Javadoc

A documentação Javadoc foi gerada para o projeto, fornecendo uma descrição detalhada das classes, métodos e parâmetros do código. Os comentários Javadoc foram incluídos em cada classe e método do projeto para ajudar na compreensão do código.

### Exemplo de Comentário Javadoc

- **Classe User:**
  ```java
  /**
   * Esta classe representa um usuário e contém métodos para conectar ao banco de dados
   * e verificar as credenciais dos usuários.
   */
  public class User {
      /**
       * Estabelece a conexão com o banco de dados.
       * 
       * @return A conexão estabelecida com o banco de dados.
       */
      public Connection conectarBD() {
          // Código de conexão ao banco de dados
      }
      
      /**
       * Verifica as credenciais do usuário no banco de dados.
       * 
       * @param login O nome de usuário.
       * @param senha A senha do usuário.
       * @return true se as credenciais forem válidas, false caso contrário.
       */
      public boolean verificarUsuario(String login, String senha) {
          // Código de verificação de usuário
      }
  }
  ```

## Erros Encontrados no Código

### Erro de Digitação na Classe Driver
A classe `com.mysql.Driver.Manager` está incorretamente especificada. A classe correta é `com.mysql.jdbc.Driver`.

### Falta de Tratamento de Exceções
As exceções estão sendo tratadas de forma inadequada. Em vez de apenas capturar e não fazer nada (`catch (Exception e) {}`), é importante pelo menos registrar ou lançar a exceção para que ela não seja ignorada silenciosamente.

### Injeção de SQL
A construção da consulta SQL não está usando prepared statements, tornando o código vulnerável a ataques de injeção de SQL.

### Não Fechamento da Conexão e dos Recursos do Banco de Dados
As conexões com o banco de dados e outros recursos não estão sendo fechados adequadamente após o uso, o que pode levar a vazamentos de recursos e problemas de desempenho.

### Ausência de Documentação
O código não contém documentação adequada, como comentários explicativos para as funções e métodos.

## Implantações

As funcionalidades de login e verificação de usuários foram aplicadas dentro da atividade principal da tela de login, utilizando JDBC para a conexão com o banco de dados MySQL. A classe `User` centraliza a lógica do aplicativo, garantindo a segurança e eficiência no acesso ao banco de dados.

## Versionamento

- **Versão 1.0:**
  - Implementação inicial da tela de login com conexão ao banco de dados.
  - Adição da funcionalidade de login.
  - Correção de erros encontrados durante a análise estática do código.
  - Inclusão de prepared statements para evitar injeção de SQL.
  - Tratamento adequado de exceções e fechamento de recursos.

## Autor

- **Nome completo:** Henrique Ribeiro Borges
- **E-mail:** henriqueribeiroborges@gmail.com
- **RA:** 223997

---

Para mais detalhes sobre a análise estática do código e o preenchimento do formulário de teste estático, consulte o arquivo `PLANO DE TESTE LOGIN CAIXA BRANCA.xls` no repositório.
