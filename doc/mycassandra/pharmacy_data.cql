CREATE TABLE pharmacy.users (
    userid uuid PRIMARY KEY,
    created_date timestamp,
    email text,
    firstname text,
    lastname text
)

CREATE TABLE pharmacy.user_credentials (
    email text PRIMARY KEY,
    password text,
    userid uuid
) 

INSERT INTO pharmacy.users (userid,firstname,lastname,email,created_date) VALUES (
    uuid(),
    'a',
    'b',
    'a.b@gmail.com',
    toTimestamp(now())
);
INSERT INTO sample_times (a,b,c,d) VALUES (1, toUnixTimestamp(now()), 50554d6e-29bb-11e5-b345-feff819cdc9f, toTimestamp(now()));