create table player
(
    id_player  serial,
    name varchar,
    number  int,
    primary key (id)
);

create table sponsor
(
    id_sponsor  serial,
    name varchar,
    primary key (id)
);

create table team
(
    id_team  serial,
    datetime date,
    stadium  varchar,
    id_player REFERENCES player(id_player),
    id_sponsor REFERENCES sponsor(id_sponsor)
    primary key (id)
);

create table match
(
    id  serial,
    datetime date,
    stadium  varchar,
    id_team REFERENCES team(id_team),
    primary key (id)
);




