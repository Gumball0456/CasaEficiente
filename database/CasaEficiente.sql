/*
    conta(nomeUtilizador(chave), palavraPasse, numUtilizador)
    
    Utilizador(numUtilizador(chave), primeiroNome, ultimoNome, tipoUtilizador)
    Cliente(numUtilizador(chave),provincia, municipio, bairro)
    Empreiteiro(numUtilizador(chave), )
    Administrador(numUtilizador(chave), )
    Corretor(numUtilizador(chave), )
    
    Imovel(numImovel, caminhoImagem, tipoImovel, provincia, municipio, bairro, areaImovel, numCompartimentos, preco, estado(vendnumo, arrendado))
    Comercial(numImovel, tipoImovel)
    Residencia(numImovel, numQuartos, numWC, numCozinhas, numSalas)
    Vivenda(numImovel, temQuintal)
    Apartamento(numImovel, numVarandas, andar)
   
    Manutencao(numManutencao, data, descricao, numEmpreiteiro)
    Aluguer(numImovel, numUtilizador);
*/

CREATE TABLE utilizador(
    numUtilizador SMALLINT(5) NOT NULL UNIQUE AUTO_INCREMENT,
    primeiroNome varchar(128) NOT NULL,
    ultimoNome varchar(128) DEFAULT NULL,
    PRIMARY KEY(numUtilizador)
);

CREATE TABLE conta(
    nomeUtilizador VARCHAR(128) UNIQUE NOT NULL,
    palavraPasse VARCHAR(128) NOT NULL,
    numUtilizador SMALLINT(5) NOT NULL UNIQUE,
    FOREIGN KEY(numUtilizador) REFERENCES utilizador(numUtilizador)
);

CREATE TABLE cliente(
    numUtilizador SMALLINT(5) NOT NULL UNIQUE,
    nomeUtilizador VARCHAR(128) UNIQUE NOT NULL,
    provicia VARCHAR(128) NOT NULL, 
    municipio VARCHAR(128) NOT NULL, 
    bairro VARCHAR(128) DEFAULT NULL,
    PRIMARY KEY(numUtilizador)
    FOREIGN KEY(numUtilizador) REFERENCES utilizador(numUtilizador)
);

CREATE TABLE empreiteiro(
    numUtilizador SMALLINT(5) NOT NULL UNIQUE, 
    PRIMARY KEY(numUtilizador), 
    FOREIGN KEY(numUtilizador) REFERENCES utilizador(numUtilizador),

);

CREATE TABLE administrador(
    numUtilizador SMALLINT(5) NOT NULL UNIQUE, 
    PRIMARY KEY(numUtilizador), 
    FOREIGN KEY(numUtilizador) REFERENCES utilizador(numUtilizador),
);

CREATE TABLE corretor(
    numUtilizador SMALLINT(5) NOT NULL UNIQUE, 
    PRIMARY KEY(numUtilizador), 
    FOREIGN KEY(numUtilizador) REFERENCES utilizador(numUtilizador),
);

CREATE TABLE imovel(
    numImovel SMALLINT(5) NOT NULL UNIQUE,
    caminhoImagem varchar(128) DEFAULT NULL,
    tipoImovel varchar(50) NOT NULL,
    area decimal(8,2) NOT NULL, 
    provicia VARCHAR(128) NOT NULL, 
    municipio VARCHAR(128) NOT NULL, 
    bairro VARCHAR(128) DEFAULT NULL,
    numCompartimentos SMALLINT(3),
    preco DECIMAL(10,5),
    --vendido ou arrendado ou NULL
    estado varchar(50) DEFAULT NULL,
    PRIMARY KEY(numImovel)
);

CREATE TABLE imovelComercial(
    numImovel SMALLINT(5) NOT NULL UNIQUE, 
    descricaoImovel VARCHAR(512) DEFAULT NULL,
    PRIMARY KEY(numImovel), 
    FOREIGN KEY(numImovel) REFERENCES imovel(numImovel)
);

CREATE TABLE residencia(
    numImovel SMALLINT(5) NOT NULL UNIQUE,
    numQuartos SMALLINT(3) NOT NULL,
    numWC SMALLINT(3) NOT NULL,
    numCozinhas SMALLINT(3) NOT NULL,
    numSalas SMALLINT(3) NOT NULL
    PRIMARY KEY(numImovel), 
    FOREIGN KEY(numImovel) REFERENCES imovel(numImovel)
);

CREATE TABLE vivenda(
    numImovel SMALLINT(5) NOT NULL UNIQUE,
    temQuintal BOOLEAN,
    PRIMARY KEY(numImovel), 
    FOREIGN KEY(numImovel) REFERENCES imovel(numImovel)
);

CREATE TABLE apartamento(
    numImovel SMALLINT(5) NOT NULL UNIQUE,
    numVarandas SMALLINT(3),
    andar SMALLINT(3)
    PRIMARY KEY(numImovel), 
    FOREIGN KEY(numImovel) REFERENCES imovel(numImovel)
);

CREATE TABLE manutencao(
    numImovel SMALLINT(5) NOT NULL,
    numEmpreiteiro SMALLINT(5), 
    dataRequerida DATE NOT NULL, 
    dataRealizada DATE NOT NULL, 
    descricaoManutencao VARCHAR(256), 
    PRIMARY KEY(numImovel, numEmpreiteiro),
    FOREIGN KEY(numImovel) REFERENCES imovel(numImovel),
    FOREIGN KEY(numEmpreiteiro) REFERENCES empreiteiro(numUtilizador)
);

CREATE TABLE aluguer(
    numImovel SMALLINT(5) NOT NULL,
    numEmpreiteiro SMALLINT(5), 
    PRIMARY KEY(numImovel, numEmpreiteiro),
    FOREIGN KEY(numImovel) REFERENCES imovel(numImovel),
    FOREIGN KEY(numEmpreiteiro) REFERENCES empreiteiro(numUtilizador)
);