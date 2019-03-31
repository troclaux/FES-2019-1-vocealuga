CREATE TABLE Cliente (
    CPF VARCHAR(255) PRIMARY KEY,
    DataNasc DATE,
    NmrTelefone VARCHAR(255)
);

CREATE TABLE Habilitacao (
    NmrHabilitacao VARCHAR(15) NOT NULL,
    Tipo VARCHAR(10) NOT NULL,
    Categoria VARCHAR(2) NOT NULL,
    Cpf_cliente VARCHAR(255),
    DataExped DATE,
    DataVencimento DATE,
    PRIMARY KEY (NmrHabilitacao)
    );

CREATE TABLE Cartao (
    NmrCartao VARCHAR(24) NOT NULL,
    Tipo VARCHAR(15) NOT NULL,
    Validade DATE NOT NULL,
    Titular VARCHAR(255) NOT NULL,
    PRIMARY KEY (NmrCartao)
);

CREATE TABLE Endereco (
    Nome VARCHAR(255) NOT NULL,
    Numero VARCHAR(10) NOT NULL,
    Cep VARCHAR(15) NOT NULL,
    Bairro VARCHAR(255) NOT NULL,
    Id_Ender INTEGER NOT NULL,
    Cidade VARCHAR(255) NOT NULL,
    Estado VARCHAR(255) NOT NULL,
    Logradouro VARCHAR(255) NOT NULL,
    PRIMARY KEY (Id_Ender)
);

CREATE TABLE Cartao_Cliente (
    fk_Cliente_CPF VARCHAR(255),
    fk_Cartao_NmrCartao VARCHAR(24)
);

CREATE TABLE Endereco_Cliente (
    fk_Endereco_Id_Ender INTEGER,
    fk_Cliente_CPF VARCHAR(255)
);

ALTER TABLE Habilitacao ADD CONSTRAINT FK_Habilitacao_2
    FOREIGN KEY (Cpf_cliente)
    REFERENCES Cliente (CPF)
    ON DELETE CASCADE;

ALTER TABLE Cartao_Cliente ADD CONSTRAINT FK_Cartao_Cliente_1
    FOREIGN KEY (fk_Cliente_CPF)
    REFERENCES Cliente (CPF)
    ON DELETE RESTRICT;

ALTER TABLE Cartao_Cliente ADD CONSTRAINT FK_Cartao_Cliente_2
    FOREIGN KEY (fk_Cartao_NmrCartao)
    REFERENCES Cartao (NmrCartao)
    ON DELETE RESTRICT;

ALTER TABLE Endereco_Cliente ADD CONSTRAINT FK_Endereco_Cliente_1
    FOREIGN KEY (fk_Endereco_Id_Ender)
    REFERENCES Endereco (Id_Ender)
    ON DELETE RESTRICT;
