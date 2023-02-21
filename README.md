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

Banco local MySql - Perfil "dev"

Antes de inicar a aplicação, certifique-se de ter instalado o MySql Server em sua máquina.
Também será necessário criar o banco de dados, podendo ser através do terminal do mysql(configurar variavel de ambiente) ou do mysql workbench.
Utilize o comando "create database taskmgr_db;"

Após criar o banco, abra o arquivo application.properties em src/main/resources.
Altere o valor de "spring.profiles.active=" para spring.profiles.active=dev
Altere os valores de user e password de acordo com a configuração do seu banco.

Caso esteja rodando aplicação pela primeira vez, verifique se o valor de "spring.jpa.hibernate.ddl-auto=" está marcado como "update".
Ao executar sera feita uma carga inicial de dados com algumas tarefas de exemplo.
Após isso, mude o valor de "spring.jpa.hibernate.ddl-auto=" para none.







