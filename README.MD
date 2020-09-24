# Ejemplo de Jdbc en Java con Postgres
## Crear archivo .env en el raiz del proyecto
``` bash 
POSTGRES_USER=dbadm
POSTGRES_PASSWORD=dbpwd
POSTGRES_DB=example

PGADMIN_DEFAULT_EMAIL=paradigmas@unlar.edu.ar
PGADMIN_DEFAULT_PASSWORD=abc123
```

## Recordar bajar el .jar del driver del motor de base de datos

[Link de Descarga JDBC Driver](https://jdbc.postgresql.org/download.html)


## Database

En el diretorio  [database](database/script01.sql) pueden encontrar los script de la base de datos

## Docker
Para inicializar el motor y el pgadmin ejecutar los siguiente en la consola dentro del directorio raiz
``` bash
docker-compose up --build -d 
```

## Requisitos
* Docker
* Java 8
* JDBC Driver