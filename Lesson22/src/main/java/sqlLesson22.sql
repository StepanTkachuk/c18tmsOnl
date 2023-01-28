insert into workers_db.workers(login, salary, age, date, description)
values ('aaa', 2000, 24, '2016-05-11', 'sasafsdgdsgsdg');
insert into workers_db.workers(login, salary, age, date, description)
values ('zzz', 4800, 25, '2014-10-24', 'dsfdsfdsfsfsdf');
insert into workers_db.workers(login, salary, age, date, description)
values ('bbb', 1200, 26, '2022-11-12', 'iuiouoiuouiouu');
insert into workers_db.workers(login, salary, age, date, description)
values ('ccc', 2750, 27, '1995-08-01', 'wqewqewqewqeqw');
insert into workers_db.workers(login, salary, age, date, description)
values ('ggg', 1450, 24, '1998-02-06', 'nmmnmnmnmnmnnm');
insert into workers_db.workers(login, salary, age, date, description)
values ('lll', 6540, 25, '2016-03-03', 'xzcxczxczxczxx');
insert into workers_db.workers(login, salary, age, date, description)
values ('eee', 3550, 28, '2022-09-25', 'trytryrtytrytt');
insert into workers_db.workers(login, salary, age, date, description)
values ('lll', 5000, 30, '2023-01-01', 'klkljkjljkljjl');

select*
from workers_db.workers
where id in (1, 2, 3, 5);
select*
from workers_db.workers
where login in ('eee', 'bbb', 'zzz');
select*
from workers_db.workers
where id in (1, 8, 5, 7, 9)
  and login in ('ggg', 'lll', 'ccc')
  and salary > 300;

select*
from workers_db.workers
where salary between 100 and 1000;
select*
from workers_db.workers
where id between 3 and 10
  and salary between 3000 and 5000;

select id as userId, login as userLogin, salary as userSalary
from workers_db.workers;

select distinct salary
from workers_db.workers;
select distinct age
from workers_db.workers;

select min(age)
from workers_db.workers;
select max(age)
from workers_db.workers;
select min(salary)
from workers_db.workers;
select max(salary)
from workers_db.workers;

select sum(salary)
from workers_db.workers;
select sum(salary)
from workers_db.workers
where age between 21 and 25;
select sum(salary)
from workers_db.workers
where id in (1, 2, 3, 5);

select avg(salary)
from workers_db.workers;

select*
from workers_db.workers
where date > current_date;

insert into workers_db.workers(login, salary, age, date, description)
values ('sss', 125, 14, now(), 'dsfdsfdsfdsfs');
insert into workers_db.workers(login, salary, age, date, description)
values ('sss', 125, 14, current_date, 'dsfdsfdsfdsfs');
insert into workers_db.workers(login, salary, age, date, description)
values ('kkk', 450, 18, current_timestamp, 'safasfsafasg');

select*
from workers_db.workers
where extract(year from date) = 2016;
select*
from workers_db.workers
where extract(month from date) = 03;
select*
from workers_db.workers
where extract(day from date) = 03;
select*
from workers_db.workers
where extract(day from date) = 05
  and extract(month from date) = 04;
select*
from workers_db.workers
where extract(day from date) in (1, 7, 11, 12, 15, 19, 21, 29);
select*
from workers_db.workers
where extract(dow from date) = 02;
select*
from workers_db.workers
where extract(day from date) between 1 and 10
  and extract(year from date) = 2016;
select*
from workers_db.workers
where extract(day from date) < extract(month from date);
select*, extract(day from date)as day,extract(month from date)as month,extract(year from date)as year
from workers_db.workers;
select*, extract(dow from date) as номер_текущего_дня
from workers_db.workers;

select extract(year from date)as year,extract(month from date)as month,extract(day from date)as day
from workers_db.workers;

select date
from workers_db.workers;

select to_char(date, 'dd.MM.yyyy')
from workers_db.workers;
select to_char(date, 'yyyy% dd.MM')
from workers_db.workers;

select(date + interval '1 day')
from workers_db.workers;
select(date - interval '1 day')
from workers_db.workers;
select(date + interval '1 day 2 hours')
from workers_db.workers;
select(date + interval '1 year 2 month')
from workers_db.workers;
select(date + interval '1 day 2 hour 3 minutes')
from workers_db.workers;
select(date + interval '2 hour 3 minute 5 second')
from workers_db.workers;
select(date + interval '1 day'- interval '2 hour')
from workers_db.workers;
select(date + interval '1 day'- interval '2 hour 3 minute')
from workers_db.workers;


select 3 as res
from workers_db.workers;
select 'eee' as res
from workers_db.workers;
select 3 "3"
from workers_db.workers;

select salary, age, (salary + age) as res
from workers_db.workers;
select salary, age, (salary - age) as res
from workers_db.workers;
select salary, age, (salary * age) as res
from workers_db.workers;
select salary, age, ((salary + age) / 2) as res
from workers_db.workers;
select*
from workers_db.workers
where (extract(day from date) + extract(month from date)) < 10;

select "left"(description, 5)
from workers_db.workers;
select "right"(description, 5)
from workers_db.workers;
select substring(description, 2, 10)
from workers_db.workers;

select concat(salary, age) as res
from workers_db.workers;
select concat(salary, age, '!!!') as res
from workers_db.workers;
select concat(salary, '-', age) as res
from workers_db.workers;
select concat("left"(login, 5), '...') as res
from workers_db.workers;

select age, min(salary)
from workers_db.workers
group by age
order by age;

select age, max(salary)
from workers_db.workers
group by age
order by age;

select age, array_to_string(array_agg(id), ',')
from workers_db.workers
group by age;

select*
from workers_db.workers
where salary > (select avg(salary) from workers);

select*
from workers_db.workers
where age < (select(avg(salary) / 2 * 3) from workers);


select*
from workers_db.workers
where salary = (select min(salary) from workers);

select*
from workers_db.workers
where salary = (select max(salary) from workers);

select*, max(salary)as max
from workers_db.workers
where age=25
group by id, login, salary, age, date, description;


select*, (select(max(age) - min(age)) / 2 from workers)as avg
from workers_db.workers;

select*, (select(max(salary) - min(salary)) / 2 from workers_db.workers)as avg
from workers_db.workers
where age=25;