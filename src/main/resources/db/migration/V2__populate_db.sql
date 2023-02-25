INSERT INTO WORKER ( NAME, BIRTHDAY, LEVEL, SALARY) VALUES 
('Katharine', '1991-07-11', 'Trainee', 300),
('Humphrey ', '1989-05-15', 'Trainee', 300),
('Cary', '1981-05-10', 'Junior', 500),
('Audrey', '1993-11-18', 'Junior', 500),
('James', '1985-02-14', 'Junior', 700),
('Marlon ', '1995-09-03', 'Junior', 800),
('Ingrid ', '1987-08-24', 'Middle', 2300),
('Fred', '1990-04-19', 'Middle', 2100),
('Greta', '1961-05-10', 'Senior', 5500),
('Elizabeth', '1961-05-10', 'Senior', 6300);

INSERT INTO CLIENT ( NAME) VALUES 
('Clark'),
('Judy'),
('Spencer'),
('Marlene'),
('Barbara');

INSERT INTO PROJECT (CLIENT_ID, START_DATE,
FINISH_DATE) VALUES 
(1, '2023-01-04', DATEADD(MONTH, 1, DATE '2023-01-04')),
(5, '2022-03-08', DATEADD(MONTH, 17, DATE '2022-03-08')),
(5, '2022-01-12', DATEADD(MONTH, 32, DATE '2022-01-12')),
(1, '2021-01-19', DATEADD(MONTH, 54, DATE '2021-01-19')),
(3, '2019-11-07', DATEADD(MONTH, 81, DATE '2019-11-07')),
(4, '2017-07-03', DATEADD(MONTH, 73, DATE '2017-07-03')),
(4, '2023-01-09', DATEADD(MONTH, 90, DATE '2023-01-09')),
(5, '2016-08-06', DATEADD(MONTH, 97, DATE '2016-08-06')),
(2, '2015-06-01', DATEADD(MONTH, 99, DATE '2015-06-01')),
(2, '2019-09-28', DATEADD(MONTH, 67, DATE '2019-09-28'));

INSERT INTO PROJECT_WORKER (PROJECT_ID, WORKER_ID) VALUES
(1, 1), (1, 3), (1, 7), (2, 2), 
(2, 3), (3, 4), (3, 5), (3,6),
(4, 3), (4, 4), (5, 7), (6, 7),
(6, 8), (6, 3), (7, 2), (7, 3),
(7, 4), (7, 5), (7, 7), (8, 8),
(8, 9), (9, 7), (9, 8), (9, 10),
(10, 6), (10, 7), (10, 10);


