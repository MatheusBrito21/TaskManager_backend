# TaskManager
Esta é uma API Rest para gerencimaneto de tarefas, criada utilizando Java e Spring Boot.

<h3>Tecnicas e ferramentas utilizadas:</h3>
<p>Maven<br>
JPA;<br>
Hibernate;<br>
Injenção de Dependências;<br>
Banco de dados Relacional(Mysql e H2);<br>
Objeto de Transferência de dados - DTOs;<br>
Exception Handler e Exceções personalizadas;<br>
Angular para front-end:</p>

<h2>Como utilizar</h2>
<p>
Primeiro realize o clone do projeto em sua máquina atrvés do terminal do git.<be>
Há dois perfis para utilização do banco de dados relacional. Seguem as configurações.<br>
</p>

<h1>Banco em Memória  H2 data base - Perfil "teste"<h1>

<p>
Abra o arquivo application.properties em src/main/resources.
https://github.com/MatheusBrito21/TaskManager_backend/blob/main/assets/imagens/turorialGIT/testeProfile.JPG


Altere o valor de "spring.profiles.active=" para spring.profiles.active=teste
Inicie a aplicação e o banco sera instanciado automaticamente com o nome "taskmgr_db".
Para acessar o console do H2 entre em http://localhost:8080/h2/console
</p>

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







