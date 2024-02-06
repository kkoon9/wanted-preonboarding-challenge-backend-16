INSERT INTO `performance` (id, name, round, type, start_date, is_reserve)
VALUES (1, '레베카', 1, 'CONCERT', '2024-01-20 19:30:00', 1);

INSERT INTO `performance_seat_info`(id, performance_id, round, price) VALUES
 (1, 1, 1, 1, 'A', 1, 1, DEFAULT, DEFAULT)
,(2, 1, 1, 1, 'A', 2, 1, DEFAULT, DEFAULT)
,(3, 1, 1, 1, 'A', 3, 1, DEFAULT, DEFAULT)
,(4, 1, 1, 1, 'A', 4, 1, DEFAULT, DEFAULT);
