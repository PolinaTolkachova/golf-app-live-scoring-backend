INSERT INTO tournaments (group_name, name, start_date, finish_date, format, scoring_type, location)
VALUES ('Group B', 'Spring Open', '2023-04-01', '2023-04-07', 'Stroke Play', 'Standard', 'Augusta National');

INSERT INTO users (username, email, password) VALUES ('john_doe', 'john@example.com', 'hashedpassword');
SELECT LAST_INSERT_ID() INTO @user_id;
INSERT INTO players (user_id, gender, handicap)
VALUES (@user_id, 'MALE', 10);

INSERT INTO tournaments (group_name, name, start_date, finish_date, format, scoring_type, location)
VALUES ('Men HCP 0-12', 'Spring Open', '2025-04-01', '2025-04-05', 'Individual', 'Stroke Net', 'Augusta National');
SELECT LAST_INSERT_ID() INTO @tournament_id;
INSERT INTO leaderboards (tournament_id)
VALUES (@tournament_id);

INSERT INTO tournaments (group_name, name, start_date, finish_date, format, scoring_type, location)
VALUES ('Men HCP 12.1-24', 'Summer Open', '2025-06-01', '2025-06-04', 'Team', 'Stableford', 'Minsk National');
SELECT LAST_INSERT_ID() INTO @tournament_id;
INSERT INTO leaderboards (tournament_id)
VALUES (@tournament_id);
