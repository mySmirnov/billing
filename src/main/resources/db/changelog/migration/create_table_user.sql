create table if not exists users(
    id BIGSERIAL primary key,
    username varchar(255),
    password varchar(255)
)