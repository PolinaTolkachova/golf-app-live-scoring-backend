INSERT INTO tournaments (group_name, name, start_date, finish_date, format, scoring_type, location)
VALUES ('Group B', 'Spring Open', '2023-04-01', '2023-04-07', 'Stroke Play', 'Standard', 'Augusta National');

INSERT INTO users (username, email, password) VALUES ('john_doe', 'john@example.com', 'hashedpassword');
SELECT LAST_INSERT_ID() INTO @user_id;
INSERT INTO players (user_id, gender, handicap)
VALUES (@user_id, 'MALE', 10);