CREATE TABLE  IF NOT EXISTS estudiante{
id SERIAL,
nombre  VARCHAR (100) NOT NULL,
apellido VARCHAR (100) NOT NULL,
email VARCHAR (100) NOT NULL,
PRIMARY KEY (id),
UNIQUE (email)
};

CREATE TABLE IF NOT EXISTS cuestionario{
id SERIAL,
calificacion DECIMAL (5,2) NOT NULL,
descripcion VARCHAR (100) NOT NULL,
PRIMARY KEY (id)
};

CREATE TABLE IF NOT EXISTS preguntas{
id SERIAL,
pregunta VARCHAR (100) NOT NULL,
respuesta VARCHAR (100) NOT NULL,
cuestionario_id INT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY cuestionario_id REFERENCES cuestionario (id)
};

CREATE TABLE IF NOT EXISTS clases{
id SERIAL,
descripcion VARCHAR (100) NOT NULL,
link VARCHAR (100) NOT NULL,
duracion DECIMAL (10,12)
};

CREATE TABLE IF NOT EXISTS estudiante_cuestionario{
id SERIAL,
estudiante_id INT NOT NULL,
cuestionario_id INT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY estudiante_id REFERENCES estudiante (id),
FOREIGN KEY cuestionario_id REFERENCES cuestionario (id)
};


