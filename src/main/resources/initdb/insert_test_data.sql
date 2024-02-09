INSERT INTO `performance` (id, name, round, type, start_date, start_time, can_reserve, created_at, updated_at)
VALUES (1, '레베카', 1, 'CONCERT', '2024-01-20','19:30:00', 1, DEFAULT, DEFAULT);

INSERT INTO wanted.performance_seat_infos (id, performance_id, price, round, gate, line, seat, can_reserve, created_at, updated_at)
VALUES
 (1, 1, 5000, 1, 1, 'A', 1, 1, DEFAULT, DEFAULT)
,(2, 1, 10000, 1, 1, 'B', 2, 1, DEFAULT, DEFAULT)
,(3, 1, 5000, 1, 2, 'A', 3, 1, DEFAULT, DEFAULT)
,(4, 1, 10000, 1, 2, 'B', 4, 1, DEFAULT, DEFAULT);
