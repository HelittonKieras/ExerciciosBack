create table tabela_a (
id serial not null primary key,
nome varchar(50) not null )

create table tabela_b(
	id serial not null primary key,
					 nome varchar(50) not null)


alter table tabela_a add constraint fk_tabela_b foreign key (id) references tabela_b(id)
alter table tabela_a drop constraint fk_tabela_b

insert into tabela_b (nome) values ('juliana'),('Silvia');
insert into tabela_a (nome) values ('Rita'), ('Marcela'),('Monica')



alter table tabela_a add idade integer

alter table tabela_a drop column idade

alter table tabela_a rename nome to nome_esposa

alter table tabela_a rename to conjuges

select * from conjuges

alter table conjuges rename to tabela_a



update tabela_a set nome_esposa = 'Luana' where nome_esposa = 'Rita'

alter table tabela_a add salario integer

update tabela_a set salario= 2100 where salario is null

delete from tabela_a where id = 3

select * from tabela_b
select * from tabela_a

insert into tabela_a (nome_esposa, salario) values ('Maria', 1600), ('Leandra', 3800)

select nome_esposa as nome, salario as remuneracao from tabela_a

select nome_esposa from tabela_a where nome_esposa like '%Mar%'

select salario from tabela_a ta where ta.nome_esposa like '%Mar%' 

select * from tabela_a  order by nome_esposa desc

Select salario, COUNT(*) from tabela_a group by salario

select * from tabela_a


insert into tabela_b (nome) values ('Maria'), ('Leandra')

select a.nome_esposa, b.nome 
from tabela_a a
full outer join tabela_b b on a.nome_esposa = b.nome 
where a.nome_esposa is null or b.nome is null

create table tabela_a (
id serial not null primary key,
nome varchar(50) not null )

create table aluno (
	id serial primary key,
	nome_aluno varchar (100) not null,
	endereco varchar (100),
	idade integer
)

select * from aluno

insert into aluno (nome_aluno, endereco, idade) values 
('Jose Renato', 'rua francisco moisés, 12', 25),
('Luana Amim', 'rua charles moisés, 15', 26),
('Leandra Matos', 'rua germino Tunis, 160', 42);


create table disciplina (
	id serial primary key,
	nome_disc varchar(100) not null,
	cargar_hor integer
)


alter table disciplina rename column cargar_hor to carga_hor


insert into disciplina (nome_disc,carga_hor)values
('Matemática', 60),
('Português', 400),
('Equações Diferenciais B', 60);

select * from disciplina

create table professor(
	id serial,
	nome_prof varchar(100) not null,
	graduacao varchar(100)
)

insert into professor (nome_prof, graduacao)
values ('Joao Pedro Couto', 'Ciencias Contábeis'),
('Luiz Guimaraes Rosa', 'Arquitetura'),
('Amanda Amorim', 'Ciências da computação')

select * from professor

create table produto(
	id_produto serial primary key,
	nome_produto varchar(100),
	preco integer,
	check (preco >= 50)	
)

insert into produto (nome_produto, preco) values('camiseta', 50);

create table pedido (
	id serial,
	numero_do_pedido int unique not null,
	fk_id_produto integer not null,
	data_pedido date not null,
	forma_pagamento varchar(30) not null,
	endereco_entrega varchar(100) not null,
	foreign key (fk_id_produto) references produto(id_produto), 
)



select avg (idade) as media_idade_alunos from aluno 

update aluno set idade = 27 where nome_aluno = 'Luiz Ricardo Soares'

update aluno set endereco = 'Av. Norte, 350, Recife-PE' where id_aluno=2

insert into aluno (nome_aluno, endereco, idade) values 
('Richarlison Silva', 'lalala', 35),
('Luana Silva', 'lerelee', 21),
 ('Luciana Silva', 'lalala', 50)

select * from aluno
select * from aluno where idade>21 and nome_aluno like '%Silva%'

alter table professor add data_nascimento date
select * from professor

alter table professor alter column data_nascimento type varchar(10)




