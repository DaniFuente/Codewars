select id, name, birthdate, 'Generation Z' as generation from users where date_part('year', birthdate) BETWEEN 1997 AND 2012
union
select id, name, birthdate, 'Millennials' as generation from users where date_part('year', birthdate) BETWEEN 1981 AND 1996
union
select id, name, birthdate, 'Generation X' as generation from users where date_part('year', birthdate) BETWEEN 1965 AND 1980
union
select id, name, birthdate, 'Baby Boomers' as generation from users where date_part('year', birthdate) BETWEEN 1946 AND 1964
union
select id, name, birthdate, 'Silent Generation' as generation from users where date_part('year', birthdate) BETWEEN 1928 AND 1945
union
select id, name, birthdate, 'Greatest Generation' as generation from users where date_part('year', birthdate) <= 1927
order by id asc