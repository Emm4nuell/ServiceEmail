create table if not exists accounts(
    id serial PRIMARY KEY,
    name VARCHAR(50) not null,
    document VARCHAR(11) unique not null,
    email VARCHAR(50) unique not null,
    birthdate DATE
)