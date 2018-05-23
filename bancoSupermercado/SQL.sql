-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE Oferta Relampago (
tempoOferta date PRIMARY KEY,
codigoProduto int
)

CREATE TABLE Oferta (
periodoOferta date PRIMARY KEY,
codigoProduto int
)

CREATE TABLE Pagamento (
cartaoCredito varchar(100) PRIMARY KEY,
valorTotal float
)

CREATE TABLE Cadastrar Cliente (
nomeCliente varchar(30),
endereçoCliente_1 varchar(30),
cpfCliente int PRIMARY KEY,
telefoneCliente varchar(30),
cidadeCliente varchar(30),
imailCliente varchar(30)
)

CREATE TABLE Iniciar Compra (
valorTotal float PRIMARY KEY,
codigoProduto int
)

CREATE TABLE produto (
codigoProduto int PRIMARY KEY,
nomeProduto varchar,
valorProduto float,
pesoProduto float,
imagemProduto varchar(100)
)

ALTER TABLE Oferta Relampago ADD FOREIGN KEY(codigoProduto) REFERENCES produto (codigoProduto)
ALTER TABLE Oferta ADD FOREIGN KEY(codigoProduto) REFERENCES produto (codigoProduto)
ALTER TABLE Pagamento ADD FOREIGN KEY(valorTotal) REFERENCES Iniciar Compra (valorTotal)
ALTER TABLE Iniciar Compra ADD FOREIGN KEY(codigoProduto) REFERENCES produto (codigoProduto)
