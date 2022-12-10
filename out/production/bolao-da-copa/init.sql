CREATE TABLE fase (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome_fase VARCHAR(10)
);

CREATE TABLE pais (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome_pais VARCHAR(20)
);

CREATE TABLE placar (
	id INT AUTO_INCREMENT PRIMARY KEY,
    id_selecao1 INT,
    gols_selecao1 INT,
    id_selecao2 INT,
    gols_selecao2 INT,
    id_fase INT,
    FOREIGN KEY (id_selecao1) REFERENCES pais(id),
	FOREIGN KEY (id_selecao2) REFERENCES pais(id),
	FOREIGN KEY (id_fase) REFERENCES fase(id)
);

CREATE TABLE bolao (
	id INT AUTO_INCREMENT PRIMARY KEY,
    participante varchar(255),
    id_placar INT UNIQUE,
    id_campeao INT,

    FOREIGN KEY(id_placar)  REFERENCES placar(id),
    FOREIGN KEY(id_campeao)  REFERENCES pais(id)
);