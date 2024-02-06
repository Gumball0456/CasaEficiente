DROP TABLE utilizador;
DROP TABLE conta;
DROP TABLE cliente;
DROP TABLE empreiteiro;
DROP TABLE administrador;
DROP TABLE corretor;
DROP TABLE imovel;
DROP TABLE imovelComercial;
DROP TABLE residencia;
DROP TABLE vivenda;
DROP TABLE apartamento;
DROP TABLE manutencao;
DROP TABLE aluguer;
 
CREATE TABLE utilizador(
    numUtilizador INTEGER PRIMARY KEY autoincrement,
    primeiroNome varchar(128) NOT NULL,
    ultimoNome varchar(128) DEFAULT NULL
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
    numUtilizador SMALLINT(5) PRIMARY KEY REFERENCES utilizador(numUtilizador)
);

CREATE TABLE administrador(
    numUtilizador SMALLINT(5) PRIMARY KEY REFERENCES utilizador(numUtilizador)
);

CREATE TABLE corretor(
    numUtilizador SMALLINT(5) PRIMARY KEY REFERENCES utilizador(numUtilizador)
);

CREATE TABLE imovel(
    numImovel SMALLINT(5) PRIMARY KEY,
    caminhoImagem varchar(128) DEFAULT NULL,
    tipoImovel varchar(50) NOT NULL,
    area decimal(8,2) NOT NULL, 
    provincia VARCHAR(128) NOT NULL, 
    municipio VARCHAR(128) NOT NULL, 
    bairro VARCHAR(128) DEFAULT NULL,
    numCompartimentos SMALLINT(3),
    preco DECIMAL(10,5),
    estado varchar(50) DEFAULT NULL
);

CREATE TABLE imovelComercial(
    numImovel SMALLINT(5) PRIMARY KEY REFERENCES imovel(numImovel), 
    descricaoImovel VARCHAR(512) DEFAULT NULL
);

CREATE TABLE residencia(
    numImovel SMALLINT(5) PRIMARY KEY REFERENCES imovel(numImovel),
    numQuartos SMALLINT(3) NOT NULL,
    numWC SMALLINT(3) NOT NULL,
    numCozinhas SMALLINT(3) NOT NULL,
    numSalas SMALLINT(3) NOT NULL
);

CREATE TABLE vivenda(
    numImovel SMALLINT(5) PRIMARY KEY REFERENCES imovel(numImovel),
    temQuintal BOOLEAN
);

CREATE TABLE apartamento(
    numImovel SMALLINT(5) PRIMARY KEY REFERENCES imovel(numImovel),
    numVarandas SMALLINT(3),
    andar SMALLINT(3)
);

CREATE TABLE manutencao(
    numImovel SMALLINT(5) NOT NULL REFERENCES imovel(numImovel),
    numEmpreiteiro SMALLINT(5) REFERENCES empreiteiro(numUtilizador), 
    dataRequerida DATE NOT NULL, 
    dataRealizada DATE NOT NULL, 
    descricaoManutencao VARCHAR(256), 
    PRIMARY KEY(numImovel, numEmpreiteiro)
);

CREATE TABLE aluguer(
    numImovel SMALLINT(5) NOT NULL,
    numEmpreiteiro SMALLINT(5), 
    PRIMARY KEY(numImovel, numEmpreiteiro),
    FOREIGN KEY(numImovel) REFERENCES imovel(numImovel),
    FOREIGN KEY(numEmpreiteiro) REFERENCES empreiteiro(numUtilizador)
);