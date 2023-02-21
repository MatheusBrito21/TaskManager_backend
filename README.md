# TaskManager
Esta é uma API Rest para gerencimaneto de tarefas, criada utilizando Java e Spring Boot.

Tecnicas e ferramntas utilizadas:
JPA;
Hibernate;
Injenção de Dependências;
Banco de dados Relacional(Mysql e H2);
Objeto de Transferência de dados - DTOs;
Exception Handler e Exceções personalizadas;
Angular para front-end:

Como utilizar

Primeiro realize o clone do projeto em sua máquina atrvés do terminal do git.
Há dois perfis para utilização do banco de dados relacional. Seguem as configurações.

Banco em Memória  H2 data base - Perfil "teste"

Abra o arquivo application.properties em src/main/resources.
Altere o valor de "spring.profiles.active=" para spring.profiles.active=teste
Inicie a aplicação e o banco sera instanciado automaticamente com o nome "taskmgr_db".
Para acessar o console do H2 entre em http://localhost:8080/h2/console







