INSERT INTO users (role, name, surname, password, email) VALUES
  ('PLAYER', 'Alex', 'Mountain', 'password123', 'alex.mountain@example.com'),
  ('PLAYER', 'Jamie', 'River', 'password123', 'jamie.river@example.com'),
  ('PLAYER', 'Casey', 'Lake', 'password123', 'casey.lake@example.com'),
  ('PLAYER', 'Morgan', 'Grove', 'password123', 'morgan.grove@example.com'),
  ('PLAYER', 'Taylor', 'Hill', 'password123', 'taylor.hill@example.com'),
  ('PLAYER', 'Jordan', 'Field', 'password123', 'jordan.field@example.com'),
  ('PLAYER', 'Sydney', 'Valley', 'password123', 'sydney.valley@example.com'),
  ('PLAYER', 'Quinn', 'Cove', 'password123', 'quinn.cove@example.com'),
  ('PLAYER', 'Drew', 'Pond', 'password123', 'drew.pond@example.com'),
  ('PLAYER', 'Reese', 'Brook', 'password123', 'reese.brook@example.com');

INSERT INTO players (user_id, gender, handicap) VALUES
  (1, 'MALE', 5),
  (2, 'MALE', 7),
  (3, 'MALE', 6),
  (4, 'MALE', 4),
  (5, 'MALE', 5),
  (6, 'FEMALE', 8),
  (7, 'FEMALE', 10),
  (8, 'FEMALE', 7),
  (9, 'FEMALE', 6),
  (10, 'FEMALE', 5);

INSERT INTO tournaments (group_name, name, start_date, finish_date, format, scoring_type, location) VALUES
  ('Masters', 'Masters Tournament', '2023-04-06', '2023-04-09', 'Stroke Play', 'Standard Scoring', 'Augusta, Georgia'),
  ('US Open', 'U.S. Open Championship', '2023-06-15', '2023-06-18', 'Stroke Play', 'Standard Scoring', 'Various, USA'),
  ('The Open', 'The Open Championship', '2023-07-20', '2023-07-23', 'Stroke Play', 'Standard Scoring', 'United Kingdom'),
  ('PGA Championship', 'PGA Championship', '2023-05-18', '2023-05-21', 'Stroke Play', 'Standard Scoring', 'Various, USA'),
  ('Ryder Cup', 'Ryder Cup', '2023-09-29', '2023-10-01', 'Match Play', 'Team Scoring', 'Marco Simone, Rome')

INSERT INTO leaderboards (tournament_id) VALUES
  (1),
  (2),
  (3),
  (4),
  (5);