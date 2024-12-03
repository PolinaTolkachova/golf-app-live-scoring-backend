import React, { useState, useEffect } from 'react';
import axios from 'axios';

function Tournaments() {
  const [tournaments, setTournaments] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    const fetchTournaments = async () => {
      try {
        const response = await axios.get('/tournament');
        setTournaments(response.data);
        setLoading(false);
      } catch (err) {
        setError('Failed to fetch tournaments');
        setLoading(false);
      }
    };

    fetchTournaments();
  }, []);

  if (loading) return <div>Loading tournaments...</div>;
  if (error) return <div>{error}</div>;

  return (
    <div className="tournaments-container">
      <h1>Golf Tournaments</h1>
      <div className="tournaments-grid">
        {tournaments.map(tournament => (
          <div key={tournament.tournamentID} className="tournament-card">
            <h2>{tournament.name}</h2>
            <p>Start Date: {tournament.startDate}</p>
            <p>End Date: {tournament.finishDate}</p>
            <p>Location: {tournament.location}</p>
            <p>Format: {tournament.format}</p>
            <p>Group: {tournament.group}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default Tournaments;