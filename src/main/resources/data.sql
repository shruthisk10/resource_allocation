CREATE TABLE IF NOT EXISTS RESOURCE (
    resource_id INT PRIMARY KEY,
    resource_name VARCHAR(255),
    experience INT
);

CREATE TABLE IF NOT EXISTS RESOURCE_SKILLS (
    resource_id INT,
    skill VARCHAR(255),
    FOREIGN KEY (resource_id) REFERENCES RESOURCE (resource_id)
);

INSERT INTO RESOURCE (resource_id, resource_name, experience) VALUES
(1, 'Dennis', 4),
(2, 'Thompson', 7),
(3, 'Kim', 12),
(4, 'Aisha', 9),
(5, 'Maya', 5),
(6, 'Kumar', 3);

INSERT INTO RESOURCE_SKILLS (resource_id, skill) VALUES
(1, 'Java'), (1, 'Spring'), (1, 'JMS'), (1, 'Mysql'), (1, 'Angular'), (1, 'React'), (1, 'Web services'), (1, 'Nodejs'),
(2, 'Java'), (2, 'Oracle'), (2, 'React'), (2, 'Angular'), (2, 'Javascript'), (2, 'REST API'),
(3, 'Java'), (3, 'JSP'), (3, 'Spring'), (3, 'Oracle'), (3, 'Mysql'), (3, 'PostgreSQL'), (3, 'Mongo'), (3, 'Rest API'), (3, 'Web services'), (3, 'Docker'), (3, 'Redis'),
(4, 'Angular'), (4, 'Javascript'), (4, 'Nodejs'), (4, 'Rest API'), (4, 'Web services'), (4, 'Docker'), (4, 'SQL Server'), (4, 'PostgreSQL'),
(5, 'Spring'), (5, 'Spring Boot'), (5, 'Hibernate'), (5, 'Mysql'), (5, 'PostgreSQL'), (5, 'Nodejs'), (5, 'Python'),
(6, 'Java'), (6, 'Redis'), (6, 'Mysql'), (6, 'Javascript');
