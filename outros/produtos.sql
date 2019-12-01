create database projetoprodutos;

create table tbespecificacao(
	codigo serial primary key,
	fabricante varchar(30) not null,
	cor varchar(30) not null,
	sistema varchar(30) not null,
	detalhes varchar(30) not null
);


create table tbproduto(
	codigo serial primary key,
	nome varchar(50) not null unique,
	preco numeric not null,
	especificacao int not null unique,
	check(preco>0),
	foreign key (especificacao) references tbespecificacao(codigo)
);

alter table tbproduto add constraint preco_positivo check (preco>0);
select * from tbespecificacao;
select * from tbproduto;