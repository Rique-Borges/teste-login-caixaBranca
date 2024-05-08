# Login System README

Este é um sistema de login básico em Java que utiliza um banco de dados MySQL. O objetivo deste README é destacar os principais erros presentes no código.

## Erros no Código

1. **Nome da Classe do Driver MySQL Incorreto:**
   O nome da classe do driver MySQL está incorreto. Deveria ser "com.mysql.jdbc.Driver".

2. **Tratamento Inadequado de Exceções:**
   O tratamento de exceções no método `conectarBD()` não está adequado. Embora capture a exceção, apenas imprime a mensagem de erro. Seria melhor tratar a exceção de forma adequada, por exemplo, informando o usuário ou registrando o erro em um arquivo de log.

3. **Variáveis Públicas:**
   As variáveis `nome` e `result` na classe `User` estão declaradas como públicas, o que não é uma boa prática de programação. Elas deveriam ser privadas e acessadas por meio de métodos getters e setters.

4. **Vulnerabilidade a Ataques de Injeção de SQL:**
   O código na função `verificarUsuario()` concatena strings para formar uma consulta SQL, o que torna o sistema vulnerável a ataques de injeção de SQL. Deveria ser utilizado `PreparedStatement` com parâmetros para evitar esse tipo de vulnerabilidade.

## Como Corrigir

Para corrigir os erros mencionados acima, sugere-se:

- Corrigir o nome da classe do driver MySQL para "com.mysql.jdbc.Driver".
- Melhorar o tratamento de exceções para fornecer feedback adequado ao usuário ou registrar erros em um log.
- Alterar as variáveis `nome` e `result` para serem privadas e fornecer métodos getters e setters para acessá-las.
- Utilizar `PreparedStatement` com parâmetros para evitar ataques de injeção de SQL.

## Executando o Código

Para executar o código, é necessário ter o MySQL instalado e configurado. Além disso, é preciso incluir o driver MySQL no classpath do projeto.


