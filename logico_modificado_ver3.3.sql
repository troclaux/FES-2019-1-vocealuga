CREATE TABLE cliente (
    cpf VARCHAR(255) PRIMARY KEY,
    datanasc DATE,
    telefone VARCHAR(255),
    nome VARCHAR(255)
	
);

CREATE TABLE habilitacao (
    nmr_registro VARCHAR(15) NOT NULL,
    tipo VARCHAR(10) NOT NULL,
    categoria VARCHAR(2) NOT NULL,
    cpf_cliente VARCHAR(255),
    data_exped DATE,
    data_validade DATE,
    PRIMARY KEY (nmr_registro)
    );

CREATE TABLE cartao (
    nmr_cartao VARCHAR(24) NOT NULL,
    data_validade DATE NOT NULL,
    titular VARCHAR(255) NOT NULL,
    cod_seguranca VARCHAR(255) NOT NULL,
    PRIMARY KEY (nmr_cartao)
);

CREATE TABLE endereco (
    ender_completo VARCHAR(255) NOT NULL,
    cep VARCHAR(15) NOT NULL,
    bairro VARCHAR(255) NOT NULL,
    id_ender INTEGER NOT NULL AUTO_INCREMENT,
    cidade VARCHAR(255) NOT NULL,
    estado VARCHAR(255) NOT NULL,
    PRIMARY KEY (id_ender)
);

CREATE TABLE veiculo (
    locador VARCHAR(255) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    placa VARCHAR(8) NOT NULL,
    modelo VARCHAR(255),
    marca VARCHAR(255),
    filial VARCHAR(255),
    PRIMARY KEY (placa)
    );

CREATE TABLE cartao_cliente (
    fk_cliente_cpf VARCHAR(255),
    fk_cartao_nmr_cartao VARCHAR(24)
);

CREATE TABLE endereco_cliente (
    fk_endereco_id_ender INTEGER,
    fk_cliente_cpf VARCHAR(255)
);

ALTER TABLE habilitacao ADD CONSTRAINT FK_habilitacao_2
    FOREIGN KEY (cpf_cliente)
    REFERENCES cliente (cpf)
    ON DELETE CASCADE;

ALTER TABLE cartao_cliente ADD CONSTRAINT FK_cartao_cliente_1
    FOREIGN KEY (fk_cliente_cpf)
    REFERENCES cliente (cpf)
    ON DELETE CASCADE;

ALTER TABLE cartao_cliente ADD CONSTRAINT FK_cartao_cliente_2
    FOREIGN KEY (fk_cartao_nmr_cartao)
    REFERENCES cartao (nmr_cartao)
    ON DELETE CASCADE;

ALTER TABLE endereco_cliente ADD CONSTRAINT FK_endereco_cliente_1
    FOREIGN KEY (fk_endereco_id_ender)
    REFERENCES endereco (id_ender)
    ON DELETE CASCADE;
ALTER TABLE endereco_cliente ADD CONSTRAINT FK_endereco_cliente_2
    FOREIGN KEY (fk_cliente_cpf)
    REFERENCES cliente (cpf)
    ON DELETE CASCADE;

