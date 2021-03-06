drop table if exists road_accident;

drop table if exists accident_severity;
create table accident_severity
(oid bigint generated by default as identity (start with 1),
create_at timestamp,
update_at timestamp,
code integer,
label varchar(255),
primary key (oid)
);

drop table if exists weather_condition;
create table weather_condition
(oid bigint generated by default as identity (start with 1),
create_at timestamp,
update_at timestamp,
code integer,
label varchar(255),
primary key (oid));

drop table if exists road_surface;
create table road_surface
(oid bigint generated by default as identity (start with 1),
create_at timestamp,
update_at timestamp,
code integer, label varchar(255),
primary key (oid));

drop table if exists district_authority;
create table district_authority
(oid bigint generated by default as identity (start with 1),
create_at timestamp,
update_at timestamp,
code integer,
label varchar(255),
primary key (oid));

drop table if exists light_condition;
create table light_condition
(oid bigint generated by default as identity (start with 1),
create_at timestamp,
 update_at timestamp,
 code integer,
 label varchar(255),
 primary key (oid));

 drop table if exists police_force;
create table police_force
(oid bigint generated by default as identity (start with 1),
create_at timestamp,
update_at timestamp,
code integer,
label varchar(255),
primary key (oid));

drop table if exists road_accident;
create table road_accident
(oid bigint generated by default as identity (start with 1),
create_at timestamp,
update_at timestamp,
accident_index varchar(255),
day_of_week integer,
latitude double,
longitude double,
number_of_calsualties integer,
number_of_vehicles integer,
occur_at time,
occur_on date,
accident_severity bigint,
district_authority bigint,
light_condition bigint,
police_force bigint,
road_surface bigint,
weather_condition bigint,
primary key (oid));